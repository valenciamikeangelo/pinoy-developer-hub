/**
 * 
 */
package com.pdh.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Michael
 * Jan 21, 2014
 */

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(){
		return "home";
	}
}
