package com.demo.controllers;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.demo.model.Address;
import com.demo.model.Person;
import com.demo.service.RssService;

@Controller
@SessionAttributes("rssFeed")
public class MainController {
	
	static Logger log = Logger.getLogger(MainController.class.getName());
	
	@Autowired
	@Qualifier("person1")
    private Person person;
    
    @Autowired
    @Qualifier("address1")
    private Address address;
    
    @Autowired
    @Qualifier("rssServiceImpl")
    private RssService rssService;
    
    @RequestMapping(value = "/to-main-page", method = RequestMethod.GET)
    public String getMainPage(Model model){
    	
        model.addAttribute("key", person.getLogin());
        return "rss-setup";
    }
    
    @RequestMapping(value = "/to-rss-page", method = RequestMethod.GET)
    public String getRSSPage(@RequestParam("url") String url, Model model){

        model.addAttribute("url", url);
        
        List<String> rssFeed = rssService.readRSS(url);
        model.addAttribute("rssFeed", rssFeed);
        return "rss-display";
    }
    
    @RequestMapping(value = "/to-test-page", method = RequestMethod.GET)
    public String getPage1(Model model){
            
    	log.info("Testing main controller..");
        model.addAttribute("key", person.getLogin());
        return "test";
    }
}
