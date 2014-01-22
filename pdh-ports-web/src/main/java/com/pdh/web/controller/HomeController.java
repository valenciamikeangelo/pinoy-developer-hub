/**
 * 
 */
package com.pdh.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pdh.web.model.PageContent;

/**
 * @author Michael
 * Jan 21, 2014
 */

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(ModelMap map){
		
		PageContent pageData= new PageContent();
		pageData.setTitle("Welcome to Pinoy Developer Hub");
		map.put("pageData",pageData);
		return "home";
	}
}
