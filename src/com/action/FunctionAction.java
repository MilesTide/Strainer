package com.action;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import org.springframework.stereotype.Component;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.seg.common.Term;
import com.tools.Config;

@Component("functionAction")
public class FunctionAction {
	private String badText;
	private BufferedWriter bw;
	private String message;
	public String getBadText() {
		return badText;
	}

	public void setBadText(String badText) {
		this.badText = badText;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * 添加不良词汇
	 * @return
	 */
	public String addBadWords() {
		//添加内容为空的时候
		if("\t\t\t\t".equals(badText)){
			message="添加内容不能为空";
			return "success";
		}
		//行对不良信息进行分词
		List<Term> list = HanLP.segment(badText.trim());
		try {
			bw = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(Config.basePath + "BadWords.txt", true), "gbk"));
			//抛出停用词，加入badWords中
			for (Term t : list) {
				if (!Config.stop_words.contains(t.word)) {
					Config.badWords.add(t.word);
					bw.newLine();
					bw.write(t.word);
					bw.newLine();
					
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		message="添加不良词汇成功";
		return "success";
	}
}
