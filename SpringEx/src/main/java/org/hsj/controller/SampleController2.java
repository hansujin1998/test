package org.hsj.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController2 {
	private static final Logger logger = LoggerFactory.getLogger(SampleController2.class); // console 역할
	@RequestMapping(value="sample2", method = RequestMethod.GET) // 웹브라우저를 분석해주는 역할
	/* 
	 * GET : 속도는 빠르지만 보안 취약
	 * POST: 속도는 느리지만 보안 보장(회원가입할 시)
	 * */
	public void basic() {
		logger.info("sample2 실행됨.");
	}
}