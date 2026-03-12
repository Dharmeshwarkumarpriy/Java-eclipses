package mvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home url");
		model.addAttribute("name", "priy dhamry.");
		model.addAttribute("id", 3453);
		
		List<String> friends = new ArrayList<String>();
		friends.add("puja");
		friends.add("amit");
		friends.add("ravi");
		friends.add("rani");
		model.addAttribute("f", friends);

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
	public ModelAndView help() {
		System.out.println("this is help operation");
		
		// creating model and view object...
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "uttam");
		modelAndView.addObject("rollNumber", 747484);
		LocalDateTime now= LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		// marks...
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(78437);
		list.add(295);
		list.add(679);
		
		modelAndView.addObject("marks",list);
		
		
		// setting the view name....
		modelAndView.setViewName("help");
		
		return modelAndView;
	}

}
