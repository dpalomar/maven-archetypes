package es.adama.archetype.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 
 * @author David Palomar
 * www.adamaconsulting.es
 *
 */
@Controller
public class UserController {
	
	@RequestMapping("/test")
	public String test(){
		return "testpage";
	}

}
