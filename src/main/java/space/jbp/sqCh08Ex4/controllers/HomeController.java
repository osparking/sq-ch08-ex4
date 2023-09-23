package space.jbp.sqCh08Ex4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(Model home,
			@RequestParam(required = false) String username,
			@RequestParam(required = false) String color) {
		home.addAttribute("username", username);
		home.addAttribute("color", color);
		return "home.html";

	}
}
