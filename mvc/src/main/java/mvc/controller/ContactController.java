package mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import mvc.model.User;
import mvc.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;

	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "LearnCodeWith Dharam");
		m.addAttribute("Desc", "Home for Programmer");
		System.out.println("adding common data to model");
	}

	@RequestMapping("/contact")
	public String showForm(Model m) {
		System.out.println("creating form");
//		m.addAttribute("Header","LearnCodeWith Dharam");
//		m.addAttribute("Desc", "Home for Programmer");		
		return "contact";
	}

//	// it is old ideas....
//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String handleForm(HttpServletRequest request) {
//		String email = request.getParameter("email");
//		System.out.println("user email is :" + email);
//		return "";
//	}

//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String handleForm(@RequestParam(name = "email", required = true) String userEmail,
//			@RequestParam("userName") String userName, @RequestParam("password") String userPassword, Model model) {
//		System.out.println("user email: " + userEmail);
//		System.out.println("user name: " + userName);
//		System.out.println("user password: " + userPassword);
//
//		User user=new User();
//		user.setEmail(userEmail);
//		user.setUserName(userName);
//		user.setPassword(userPassword);
//		
//		System.out.println(user);
//		
//		// process...
////		model.addAttribute("name", userName);
////		model.addAttribute("email", userEmail);
////		model.addAttribute("password", userPassword);
//
//		model.addAttribute("user",user);
//		return "success";
//	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute("user") User user, Model model) {
		System.out.println(user);
		int createUser = this.userService.createUser(user);
		model.addAttribute("msg", "user created via id " + createUser);
		// process...
//		model.addAttribute("Header","LearnCodeWith Dharam");
//		model.addAttribute("Desc", "Home for Programmer");//		
		return "success";
	}

}
