package com.mario.fisievent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class RootController {

	@RequestMapping("/")
	public String index(Model model) {
		
		return "index";
	}
	
	
}
