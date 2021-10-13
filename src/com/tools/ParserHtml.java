package com.tools;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


/**
 * 解析小说，获取正文
 * @author FSD
 *
 */
public class ParserHtml {
	
	/**
	 * 根据url获取URL内的所有的p标签的文本内容
	 * @param urls
	 * @return
	 * @throws Exception
	 */
	public static StringBuffer jsoupParserHtml(String url) {
		 Document doc ;  
		 String title="";
		 StringBuffer sb = new StringBuffer();
		 try{
	            doc = Jsoup.connect(url).data("query", "Java")
	                    .userAgent("Mozilla")
	                    .cookie("auth", "token")
	                    .timeout(5000)
	                    .get();  
	            title = doc.title();
	            Elements listClass = doc.getElementsByTag("p");
	            for (Element listItem : listClass){  
	                String text = listItem.text();  
	                sb.append(text);
	            }  
		 }catch(Exception e){
			 throw new RuntimeException("解析网页内容出现错误");
		 }
		 //爬取不到任何内容，返回“我”，防止出现异常，“我”时停用词，对结果没有影响
			 return sb.append(title).append("我");   
	}
	/**
	 * 获取文本格式的正文
	 * @param str
	 * @return
	 */
	public static String getText(String str) {
		str = str.replaceAll("(&[a-zA-Z]*;)|(<[a-zA-Z]*>)|(<[a-zA-z]*.?([a-zA-z]*=['\"].*['\"])>)|(</[a-zA-z]*>)|(<[a-zA-z]*.?([a-zA-z]*=['\"].*['\"]).?/>)|(<[a-zA-z]*.?/>)", "");
		return str;
	}
}
