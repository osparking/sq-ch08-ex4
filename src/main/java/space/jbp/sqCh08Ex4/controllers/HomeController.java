package space.jbp.sqCh08Ex4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home/{username}/{color}")
	public String home(Model home,
			@PathVariable String username,
			@PathVariable String color) {
		home.addAttribute("username", username);
		home.addAttribute("color", color);
		return "home.html";

	}
}
