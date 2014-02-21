package com.skt.wifi.mgr.login.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skt.wifi.mgr.login.domain.Admin;
import com.skt.wifi.mgr.login.domain.User;
import com.skt.wifi.mgr.login.persistence.AdminDao;
import com.skt.wifi.mgr.login.persistence.LoginDao;
import com.skt.wifi.mgr.login.persistence.LoginDaoImpl;

@Service
public class LoginServiceImpl implements LoginService {
	private static final Logger logger = LoggerFactory
			.getLogger(LoginServiceImpl.class);

	@Autowired
	LoginDao loginDao;

	@Autowired
	AdminDao adminDao;

	@Override
	public User doSomeBusinessStuff(String userId) {

		logger.info("param - userId : {}", userId);

		User user = loginDao.getUser(userId);
		logger.info("loginDao.getUser(userId) Result - user.getUserId() : {}",
				user.getUserId());

		return user;
	}

	@Override
	public Map<String, Object> getAdmin() {
		logger.info("getAdmin() Start");

//		Map<String, Object> result = adminDao.getAdmin();
//
//		logger.info("adminDao.getAdmin() Result - result.size() : {}",
//				result.size());
//
//		return result;
		 return null;
	}

	@Override
	public Admin getAdminObject() {
//		logger.info("getAdminObject() Start");
//
//		Admin result = adminDao.getAdminObject();
//
//		return result;
		 return null;
	}
}
