package pack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController{
	@GetMapping("/mailconsult")
	public String mailconsult(Model model) {
		return "/html.customer/mailconsult";
	}
	
	@GetMapping("/chatconsult")
	public String mailconsult() {
		return "/html.customer/chatconsult";
	}


}
