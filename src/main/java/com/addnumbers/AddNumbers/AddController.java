package com.addnumbers.AddNumbers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {
	
	@RequestMapping("add")
	public String Hello(@RequestParam("firstvalue") int i,@RequestParam("secondvalue") int j)
	{
		return i+j+""; 
		
	}

}
