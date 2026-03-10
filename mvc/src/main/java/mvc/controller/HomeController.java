package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		System.out.println("this is home url");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about controller");		
		return "about";
	}
	
	@RequestMapping("/services")
	public String services() {
		System.out.println("this is services provider");
		return "services";
	}
	
	@RequestMapping("/help")
	public String help() {
		System.out.println("this is help operation");
		return "help";
	}
	
}
