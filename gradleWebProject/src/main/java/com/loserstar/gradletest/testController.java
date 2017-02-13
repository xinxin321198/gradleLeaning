package com.loserstar.gradletest;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {

	@RequestMapping("/")
	public String IndexOutOfBoundsException(){
		return "index";
	}
	
	@RequestMapping(value="home")
	public String home() throws JsonGenerationException, JsonMappingException, IOException{
		Map<String, String> returnMap = new HashMap<String,String>();
		returnMap.put("1111", "laoluo");
		returnMap.put("222", "¿œ¿Ó");
		ObjectMapper json = new ObjectMapper();
//		return json.writeValueAsString(returnMap);
		return "view/home";
	}
}
