package com.skt.wifi.mgr.login.controller;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import javax.print.attribute.standard.DateTimeAtCompleted;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.skt.wifi.mgr.login.domain.Admin;
import com.skt.wifi.mgr.login.service.AdminService;
import com.skt.wifi.mgr.login.service.LoginService;

@Controller
public class AdminController {
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Autowired
	AdminService adminService;
	
	@RequestMapping(value = "/admin/insert", method = RequestMethod.GET)
	public String insertAdmin(Model model) {
		logger.info("Welcome insertAdmin!");
		
		Admin admin = new Admin();
		
		admin.setAdmin_id("admin_id_1");
		admin.setAdmin_nm("admin_name_1");
		admin.setAdmin_group("admin_group_1");
		admin.setPassword("password_1");
		admin.setUse_yn("Y");
		admin.setCre_id("cre_id_1");		
		admin.setCre_dtd(Calendar.getInstance().getTime());
		admin.setUpd_id("upd_id_1");
		admin.setUpd_dtd(Calendar.getInstance().getTime());
		
		logger.info("admin.getADMIN_ID {}", admin.getAdmin_nm());
		
		int result = adminService.insertAdmin(admin );
		
		logger.info("adminService.insertAdmin = result {}",result);		
		
		model.addAttribute("result", result);

		return "home";
	}
	
	@RequestMapping(value="/admin/update", method = RequestMethod.GET)
	public String update(Model model) {
		logger.info(" update!");
		
		Admin admin = new Admin();		
		admin.setAdmin_id("admin_id_1");
		admin.setAdmin_nm("admin_name_update");
		admin.setUpd_id("upd_id_update");
		admin.setUpd_dtd(Calendar.getInstance().getTime());
		
		int result = adminService.updateAdmin(admin);			
		logger.info("adminService.updateAdmin = result {}",result);	
		
		model.addAttribute("result", result);
		
		return "home";
	}
	@RequestMapping(value="/admin/select", method = RequestMethod.GET)
	public String select(Model model) {
		logger.info(" select! 1");
		
		Admin admin = new Admin();		
		admin.setAdmin_id("admin_id_1");
		logger.info(" select! 2");
		Admin result = adminService.getAdmin(admin);	
		
		logger.info(" select! 3");
		logger.info("adminService.updateAdmin = result {}",result);	
		
		logger.info(" select! 4");
		model.addAttribute("result1", result);
		
		return "home";
	}
	
	@RequestMapping(value="/admin/delete", method = RequestMethod.GET)
	public String delete(Model model) {
		logger.info(" delete!");
		
		Admin admin = new Admin();		
		admin.setAdmin_id("admin_id_1");
		
		int result = adminService.deleteAdmin(admin);		
		logger.info("adminService.updateAdmin = result {}",result);	
		
		model.addAttribute("result", result);
		
		return "home";
	}
}
