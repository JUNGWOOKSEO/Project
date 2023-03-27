package pack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class CustomerController implements WebMvcConfigurer{
	 
//	 @GetMapping("/index")
//	    public String main(){
//	        return "index";
//	    }
	//
	@GetMapping("/login")
	public String loginpage(Model model) {
		return "html.login/login";
	}
	
	@GetMapping("prodtmain")
	public String productmain() {
		return "html.product/prodtmain";
	}

//	@GetMapping("faq")
//	public String fPage(Model model) {
//		return "faq";
//	}
//
//	@PostMapping("faq")
//	public String fpPage(Model model) {
//		return "faq";
//	}
//
//	@GetMapping("main")
//	public String mainPage(Model model) {
//		return "main";
//	}
//
//	@GetMapping("history")
//	public String historyPage(Model model) {
//		return "history";
//	}
//
//	
//	@GetMapping("chatbot")
//	public String chatPage(Model model) {
//		return "redirect:/chatbot";
//	}
//
//	@GetMapping("terms")
//	public String termsPage(Model model) {
//		return "terms";
//	}
//	@GetMapping("mail")
//	public String mailPage(Model model) {
//		return "mail";
//	}
//	@GetMapping("chatmain")
//	public String gogekPage(Model model) {
//		return "chatmain";
//	}
//
//	@GetMapping("userHeader")
//	public String headerPage(Model model) {
//		return "userHeader";
//	}
//	
	
}
