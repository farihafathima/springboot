package cgg.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class TestController {
	
	
	@RequestMapping("/first")
	public String testHandler() {
		return "hello";
	}

}
