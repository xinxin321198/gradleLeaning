package com.loserstar.controller;

import java.io.IOException;

import org.codehaus.jackson.map.JsonMappingException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonGenerationException;

@Controller
@RequestMapping(value="/home")
public class testController{

	
	@RequestMapping(value="loser")
	public String home() {
		System.out.println("homehomehomehomehomehomehomehomehomehomehomehomehome");
		return "home";
	}
	
	@RequestMapping(value="json")
	@ResponseBody
	public String json(){
		return "josnjosnjsonjosnjosn";
	}

}
