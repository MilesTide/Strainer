package com.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import com.tools.DealURL;

@Component("startAction")
public class StartAction {
	private DealURL dealURL;
	private Thread thread;
	private String message;
	
	public DealURL getDealURL() {
		return dealURL;
	}

	@Resource(name="dealURL")
	public void setDealURL(DealURL dealURL) {
		this.dealURL = dealURL;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	/**
	 * 开启监听
	 * @return
	 */
	public String start() {
		dealURL.flag = true;
		//开启监听线程
		thread = new Thread(dealURL);
		thread.start();
		message="监听已经开启。。。。。。";
		return "success";
	}
	
	/**
	 * 关闭监听
	 * @return
	 */
	public String end() {
		//设置标志为false 监听线程循环结束，对应的线程结束
		dealURL.flag = false;
		message="监听已经关闭。。。。。。";
		return "success";
	}
}
