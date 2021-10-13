package com.tools;

import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.seg.common.Term;
import com.vec.word2vec.Word2VEC;

/**
 * 获取小说的相似度
 * @author FSD
 *
 */
@Component("getSimilarity")
public class GetSimilarity {
	//词比较器
	private Word2VEC word2VEC;
	//小说正文内容的相似度
	private double content_similarity;
	//小说正文
	private StringBuffer bookContent;
	//分词结果
	private List<Term> list;
	//存储不良词汇
	private static Set<String> badWords = Config.badWords;
	//停用词
	private static Set<String> stop_words = Config.stop_words;
	//不良词汇的个数
	private int badWordCount;
	
	public int getBadWordCount() {
		return badWordCount;
	}

	public StringBuffer getBookContent() {
		return bookContent;
	}

	public void setBookContent(StringBuffer bookContent) {
		this.bookContent = bookContent;
	}

	public void setBadWordCount(int badWordCount) {
		this.badWordCount = badWordCount;
	}

	
	
	public Word2VEC getWord2VEC() {
		return word2VEC;
	}

	@Resource(name="word2VEC")
	public void setWord2VEC(Word2VEC word2vec) {
		word2VEC = word2vec;
	}
	
	/**
	 * 获取小说正文,并取摘要,分词
	 * @return
	 * @throws Exception
	 */
	private List<Term> getBookContent(String url) throws Exception {
		bookContent = ParserHtml.jsoupParserHtml(url);
		String bookSummary = HanLP.getSummary(ParserHtml.getText(bookContent.toString()), 1000);
		list = HanLP.segment(bookSummary);
		return list;
	}

	/**
	 * 获取相似度
	 * @throws Exception 
	 */
	public double getSimilarity(String url) throws Exception {
		getBookContent(url);
		
		content_similarity = 0.0;
		badWordCount = 0;
		for (Term t : list) {
			double word_similarity = 0.0;
			if (stop_words.contains(t.word))
				continue;
			for (String badWord : badWords) {
				word_similarity += word2VEC.getSimilarity(t.word, badWord);
			}
			content_similarity += (word_similarity / badWords.size());
			System.out.println("词-" + t.word + "-的相似度为：" + (word_similarity / badWords.size()));
		}
		System.out.println("小说正文相似度：" + content_similarity);
		return content_similarity;
	} 
}
