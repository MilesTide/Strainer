package com.tools;

import java.util.Set;

/**
 * 配置类
 * @author FSD
 *
 */
public class Config {
	//数据源的地址
	public static String basePath = "E:/datasource/";
	//阈值
	public static double flag = 50;
	//不良词汇
	public static Set<String> badWords;
	//停用词
	public static Set<String> stop_words;
	
	static {
		try {
			badWords = LoadBadWords.loadBadWords();
			stop_words = LoadBadWords.loadStopWords();
		}catch(Exception e){}
	}
}
