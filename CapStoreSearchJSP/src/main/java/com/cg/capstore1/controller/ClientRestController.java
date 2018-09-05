package com.cg.capstore1.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.capstore1.beans.MerchantBean;

 
@RestController
public class ClientRestController {
	@RequestMapping("/")
	public String test()
	{
		return "akanksha";
	}
	
	
	@RequestMapping("/merchantSearch")
	public ModelMap logIn(String searchBox,ModelMap map) //the name of the input coming should be same as given in search.jsp,when request param not given
	{
		/*return "Akanksha";*/
		
	RestTemplate restTemplate=new RestTemplate();
	MerchantBean merchant = restTemplate.getForObject("http://localhost:9191/searchN1?name="+searchBox, MerchantBean.class);
	System.out.println(merchant);
	map.put("merchant", merchant);
	return map;

	}
}
