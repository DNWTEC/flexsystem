package com.chochae.afes;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chochae.afes.test.dao.CustomerDAO;
import com.chochae.afes.test.model.Customer;

/**
 * Handles requests for the application home page. TEST
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
    	ApplicationContext context =
        		new ClassPathXmlApplicationContext("Spring-Module.xml");

            CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
          //  Customer customer = new Customer(3, "xx",45);
          //  customerDAO.insert(customer);

            Customer customer1 = customerDAO.findByCustomerId(1);

		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("customer", customer1.toString() );
		
		return "home";
	}
	@RequestMapping(value = "/sayhello", method = RequestMethod.GET)
	public String sayHello(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("sayHello", "Hello, Stupid!" );
		
		return "sayHello";
	}	
}
