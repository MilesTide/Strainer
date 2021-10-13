package com.action;

import org.springframework.stereotype.Component;

import com.tools.Config;

@Component("configAction")
public class ConfigAction {
	private double flag=50 ;
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public double getFlag() {
		return flag;
	}

	public void setFlag(double flag) {
		this.flag = flag;
	}
	
	public String configFlag() {
		Config.flag = flag;
		message="设置过滤等级成功！";
		return "success";
	}
}
