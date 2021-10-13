package com.action;

import org.springframework.stereotype.Component;

@Component("mainAction")
public class MainAction {
	//执行错误页面
	public String execute() {
		return "error";
	}
	
}
