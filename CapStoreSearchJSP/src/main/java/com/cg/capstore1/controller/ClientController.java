package com.cg.capstore1.controller;




import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


//Main Controller
@Controller
public class ClientController {
	@RequestMapping(value="/search")
	public String loginPage() {
		return "search";
	}
}
