package com.wzf.dubbo.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

@RestController
public class DemoController {

	/*
	 * @Reference private UserService userService;
	 */
	@Reference
	private DemoService demoService;

	@RequestMapping(value = "/xxx", method = RequestMethod.GET)
	public String getdubbo() {
		return /* userService.getUser() + */demoService.Test() + demoService.Test1(null) + demoService.Test2(null);
	}
}
