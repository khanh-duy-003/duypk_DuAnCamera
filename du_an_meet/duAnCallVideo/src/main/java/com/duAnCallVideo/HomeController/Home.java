package com.duAnCallVideo.HomeController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {
	
	@RequestMapping("/home")
	public String home(Model model) {
		
		return "home/index";
	}

}
