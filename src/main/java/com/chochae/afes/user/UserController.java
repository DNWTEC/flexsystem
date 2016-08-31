package com.chochae.afes.user;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chochae.afes.HomeController;
import com.chochae.afes.user.dao.UserDAO;
import com.chochae.afes.user.model.UserInfo;

/**
 * Handles requests for the application home page. TEST
 */
@Controller
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(Locale locale, Model model) {
		logger.debug("[USER LOGIN PAGE] starting.", locale);
		
		return "/user/login";
	}
	
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String userRegister(Locale locale, Model model) {
		logger.debug("[USER REGISTER] starting.", locale);
		
		return "/user/register";
	}
	
	@RequestMapping(value = "/saveUser", method = RequestMethod.GET)
	public @ResponseBody String registerProcess(HttpServletRequest request, ModelMap model) {
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String password = request.getParameter("password");
		
		UserInfo user = new UserInfo(id, name, password, phone, address, 82, email);
		logger.info("[SAVE USER] starting.", user);
		
		
		ApplicationContext context =
        		new ClassPathXmlApplicationContext("Spring-Module.xml");

        UserDAO userDAO = (UserDAO) context.getBean("userDAO");
        userDAO.insertUser(user);
        
		return "";
	}
	
	
	@RequestMapping(value = "/checkUser", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> checkUser(HttpServletRequest request, ModelMap model) {
		
		String id = request.getParameter("id");
		
		logger.info("[CHECK USER] starting.", id);
		
		
		ApplicationContext context =
        		new ClassPathXmlApplicationContext("Spring-Module.xml");

        UserDAO userDAO = (UserDAO) context.getBean("userDAO");
        boolean existYn = userDAO.userExistYn(id);
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("existYn", existYn? "Y" : "N");
		return result;
	}
}
