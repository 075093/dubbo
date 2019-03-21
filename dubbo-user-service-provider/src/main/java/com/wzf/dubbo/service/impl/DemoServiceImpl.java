package com.wzf.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wzf.dubbo.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

	@Override
	public String Test() {
		return "------------test--------------";
	}

	@Override
	public String Test1(String string) {
		return "------------test1--------------";
	}

	@Override
	public String Test2(Object string) {
		return "------------test2--------------";
	}
}
