package com.cruds.evs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cruds.evs.bean.ConfigCheck;
import com.cruds.evs.service.ConfigServiceImpl;

@Controller
public class ConfigController {
	
	@Autowired
	ConfigServiceImpl configCheck;
	
	@RequestMapping("/config.html")
	public String justChecking()
	{
		ConfigCheck c = new ConfigCheck("Hello just checking");
		System.out.println(c.getMsg());
		configCheck.Check(c);
		return "config";
	}

}
 