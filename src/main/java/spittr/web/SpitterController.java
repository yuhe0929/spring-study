package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spittr.data.SpittleRepository;

@Controller
@RequestMapping("/spitter")
public class SpitterController {
	//private SpittleRepository spitterRepository;
	
	@Autowired
	public SpitterController(SpittleRepository spitterRepository) {
		this.spitterRepository = spitterRepository;
	}
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String showRegistrationForm(){
		return "registerForm";
	}
	
}
