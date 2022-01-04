package com.stb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.stb.controller.StarbucksController;

@Controller
public class StarbucksController {
	
	@RequestMapping(value = "starbucksContainer", method = RequestMethod.GET)
	public String starbucksContainer() {
		return "starbucksContainer"; // include file로 연결했기때문에 메인페이지만 불러옴
	}
}
