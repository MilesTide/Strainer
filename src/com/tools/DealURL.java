package com.tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.swing.JFrame;

import org.springframework.stereotype.Component;

/**
 * 处理监听器截取的URL
 * @author FSD
 *
 */
@Component("dealURL")
public class DealURL implements Runnable {
	private BufferedReader br;
	private Set<String> set; //存储url
	private GetSimilarity getSimi;
	public volatile boolean flag;

	public GetSimilarity getGetSimi() {
		return getSimi;
	}

	@Resource(name="getSimilarity")
	public void setGetSimi(GetSimilarity getSimi) {
		this.getSimi = getSimi;
	}
	@Override
	public void run() {
		String url = null;
		set = new HashSet<String>();
		while (flag) {
			try {
				do {
					url = readLastLine(Config.basePath + "URL.txt");
					String regex = "http";
					//判断url是否以http开头
					int s = url.indexOf(regex);
					set.add("http://localhost:8080/Strainer/main");
					if (url != null && !"".equals(url) && s>=0 && !set.contains(url)) {
						set.add(url);
						double simi = getSimi.getSimilarity(url);
						System.out.println(simi + "-----------------------");
						if (simi > Config.flag) {
							//当相似度大于峰值时，弹出不良信息页面
							OpenURL.Open("http://localhost:8080/Strainer/main");
						}
					}
				} while (url != null && url != "");
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
	}
	
	/**
	 * 读取文件的最后一行
	 * @param file
	 * @return
	 * @throws IOException
	 */
	public static String readLastLine(String s) {  
		File file = new File(s);
		  if (!file.exists() || file.isDirectory() || !file.canRead()) {  
		    return null;  
		  }  
		  RandomAccessFile raf = null;  
		  try {  
		    raf = new RandomAccessFile(file, "r");  
		    long len = raf.length();  
		    if (len == 0L) {  
		      return "";  
		    } else {  
		      long pos = len - 1;  
		      while (pos > 0) {  
		        pos--;  
		        raf.seek(pos);  
		        if (raf.readByte() == '\n') {  
		          break;  
		        }  
		      }  
		      if (pos == 0) {  
		        raf.seek(0);  
		      }  
		      byte[] bytes = new byte[(int) (len - pos)];  
		      raf.read(bytes);  
		      //读完最后一行删除文件内容
		      FileOutputStream testfile = new FileOutputStream(s);
		      testfile.write(new String("").getBytes());
		        return new String(bytes);  
		    }  
		  } catch (IOException e) {  
		     e.printStackTrace();
		  } finally {  
		    if (raf != null) {  
		      try {  
		        raf.close();  
		      } catch (Exception ea) { 
		          ea.printStackTrace(); 
		      }  
		    }  
		  }  
		  return null;
	}
}
