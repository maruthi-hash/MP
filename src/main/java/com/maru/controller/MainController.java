/**
 * 
 */
package com.maru.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Admin
 *
 */
@Controller
public class MainController {
	
	@RequestMapping(value ="/",method =RequestMethod.GET)
	public String testRequest() {
		return "WELCOME TO THE TEST PROJECT";
	}
}
