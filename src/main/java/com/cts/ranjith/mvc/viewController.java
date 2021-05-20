package com.cts.ranjith.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class viewController {
	
	@RequestMapping("/view")
	public String view() {
		return "view1";
	}
    @RequestMapping("/view1")
    public String view1(){
    	return "view2";
    }
}
