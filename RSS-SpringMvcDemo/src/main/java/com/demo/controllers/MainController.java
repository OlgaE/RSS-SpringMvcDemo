package com.demo.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.model.Address;
import com.demo.model.Person;

@Controller
public class MainController {
	
	static Logger log = Logger.getLogger(MainController.class.getName());
	
	@Autowired
	@Qualifier("person1")
    private Person person;
    
    @Autowired
    @Qualifier("address1")
    private Address address;
    
    @RequestMapping(value = "/to-test-page", method = RequestMethod.GET)
    public String getPage1(Model model){
            
    	log.info("Testing main controller..");
        model.addAttribute("key", person.getLogin());
        return "test";
    }
}
