package org.hsj.controller;

import org.hsj.domain.SampleMemberDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller // 화면의 분기를 담당
@RequestMapping("sample")
public class SampleController {
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class); // console 역할
//	@RequestMapping(value="", method = RequestMethod.GET) // 웹브라우저를 분석해주는 역할
	@GetMapping("") // 윗 문장을 줄인 것
	/* 화면에서 서버로 데이터를 전송하는 방식 2가지
	 * GET : 속도는 빠르지만 보안 취약 
	 * 문법 :
	 * 	1) 
	 *	<form action="서버주소" method="get">
	 * 		id : <input type="text" name="id">
	 * 		pw : <input type="password" name="pw">
	 * 		name : <input type="text" name="name">
	 *	</form>
	 *
	 *  2) <a href="서버주소?id=aaa&pw=1234&name=정자바"></a>
	 *  
	 * POST: 속도는 느리지만 보안 보장(회원가입할 시)
	 * 문법:
	 * 	<form action="" method="post">
	 * 		id : <input type="text" name="id">
	 * 		pw : <input type="password" name="pw">
	 * 		name : <input type="text" name="name">
	 * 	</form>
	 * */
	public void basic(Model model) {
		logger.info("sample 실행됨.");
		// aaaa문자열을 abcd변수에 저장하여 sample.jsp에 보내기 
		model.addAttribute("abcd", "aaaa");
	}
	
//	@RequestMapping(value="ex01", method = RequestMethod.GET) // 웹브라우저를 분석해주는 역할
	@GetMapping("ex01")
	public String basic1(Model model) {
		logger.info("sample/ex01 실행됨.");
		model.addAttribute("zzzz", "bbbb");
		return "ex01"; // return 파일명.jsp
		
		// bbbb문자열을 zzzz변수에 저장하여 ex01.jsp에 보내기 
	}
	
//	@RequestMapping(value="index",method = RequestMethod.GET) // 웹브라우저를 분석해주는 역할
	@GetMapping("index")
	public String index(Model model) {
		model.addAttribute("yyyy", "cccc");
		return "index";
		// cccc문자열을 yyyy변수에 저장하여 index.jsp에 보내기
	}
	
	/* 기본 방법 */
//	@RequestMapping(value="member", method=RequestMethod.GET)
	@GetMapping("member")
	public String member(String id, String pw, String name, Model model) {
		System.out.println("id="+id);
		System.out.println("pw="+pw);
		System.out.println("name="+name);
		// id값을 id변수에 저장하여 member.jsp에 보내기
		model.addAttribute("id", id);
		// pw를 pw변수에 저장하여 member.jsp에 보내기
		model.addAttribute("pw", pw);
		// name값을 name변수에 저장하여 member.jsp에 보내기
		model.addAttribute("name", name);
		return "member";
	}
	
	/* 데이터의 보호와 메모리의 효율성을 높인 방법 = 파라미터 형식 */
//	@RequestMapping(value="sample/memberDTO", method=RequestMethod.POST)
	@GetMapping("memberDTO")
	public String memberDTO(SampleMemberDTO smd, Model model) {
		System.out.println("id="+smd.getId());
		System.out.println("pw="+smd.getPw());
		System.out.println("name="+smd.getName());
		// SampleMemberDTO값을 id변수에 저장하여  index.jsp에 보내기 (난이도 상)
		model.addAttribute("id", smd);
		
		return "memberDTO";
	}
	
	/*	<경로설정>
	 * 
	 *	"/"=폴더 안을 뜻함
	 *	void 메서드 value값에 /를 쓰게되면 sample폴더 안에 ex01 경로를 찾기때문에 찾을 수 없음
	 *	return메서드를 사용하여 리턴값에 ex01을 입력하면 sample/ex01경로를 찾아 ex01.jsp파일을 찾을 수 있다. 
	 *	return이 없으면  value값에 .jsp
	 *	return이 있으면 return값에 .jsp */
	
	/*
	 * */
	
	
}
