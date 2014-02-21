package com.skt.wifi.mgr.login.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.skt.wifi.mgr.login.domain.Admin;
import com.skt.wifi.mgr.login.domain.User;
import com.skt.wifi.mgr.login.service.LoginService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	LoginService loginService;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );		
	
		Map<String, Object>   result = loginService.getAdmin();
		logger.info("result - result.size() : {}.",  result.size());
		model.addAttribute("result", result.get("ADMIN_NM"));
		
//		List<Admin> admin = loginService.getAdminObject();
//		logger.info("result - result.size() : {}.", admin.size());
//		model.addAttribute("result1",  admin.get(0).getAdminName());
		
		Admin admin = loginService.getAdminObject();
		
		logger.info("result - result.size() : {}.",  admin.getAdmin_id());
		
		model.addAttribute("result1", admin);

		return "home";
	}
	
}
