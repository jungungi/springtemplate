package com.skt.wifi.mgr.login.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skt.wifi.mgr.login.domain.Admin;
import com.skt.wifi.mgr.login.persistence.AdminDao;

@Service
public class AdminServiceImpl implements AdminService{
	private static final Logger logger = LoggerFactory.getLogger(AdminServiceImpl.class);
	
	@Autowired
	AdminDao adminDao;	

	@Override
	public Admin getAdmin(Admin admin) {
		 logger.info("getAdmin() Start");
		 Admin result = adminDao.getAdmin(admin);
		return result;
	}

	@Override
	public List<Admin> getAdminList(Admin admin) {
		logger.info("getAdminList() Start");
		List<Admin> result = adminDao.getAdminList(admin);		
		return result;
	}

	@Override
	public int insertAdmin(Admin admin) {
		logger.info("insertAdmin() Start");
		int result = adminDao.insertAdmin(admin);		
		logger.info("result = " + result);		
		return result;
	}
	
	@Override
	public int updateAdmin(Admin admin) {
		logger.info("updateAdmin() Start");
		int result = adminDao.updateAdmin(admin);
		
		logger.info("result = " + result);		
		return result;
	}

	@Override
	public int deleteAdmin(Admin admin) {
		logger.info("deleteAdmin() Start");
		int result = adminDao.deleteAdmin(admin);
		
		logger.info("result = " + result);
		
		return result;
	}

}
