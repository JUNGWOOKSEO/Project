package pack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyMainController {
	@GetMapping("myinfo") 
	public String abc1() {
		return "mypage/myinfo";
	}
	@GetMapping("mydate")
	public String abc2() {
		return "mypage/mydate";
	}
	@GetMapping("membership")
	public String abc3() {
		return "mypage/membership";
	}
	@GetMapping("myvisited")
	public String abc4() {
		return "mypage/myvisited";
	}
	@GetMapping("mymain")
	public String abc5() {
		return "mypage/mymain";
	}
	@GetMapping("myChgPwd")
	public String abc6() {
		return "mypage/myChgPwd";
	}
	@GetMapping("quit")
	public String abc7() {
		return "mypage/quit";
	}
}
