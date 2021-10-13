package com.tools;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * 加载不良词汇
 * @author FSD
 *
 */
public class LoadBadWords {
	
	/**
	 * 加载不良词汇
	 * @return
	 * @throws IOException
	 */
	public static Set<String> loadBadWords() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(
						new FileInputStream(Config.basePath + "BadWords.txt"),"gbk"));
		Set<String> set = new HashSet<String>();
		String str = br.readLine();
		while (str != null) {
			set.add(str);
			str = br.readLine();
		}
		br.close();
		return set;
	}
	
	//加载停用词
	public static Set<String> loadStopWords() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(
						new FileInputStream(Config.basePath + "Stop_Words.txt"),"gbk"));
		Set<String> set = new HashSet<String>();
		String str = br.readLine();
		while (str != null) {
			set.add(str);
			str = br.readLine();
		}
		br.close();
		return set;
	}
}
