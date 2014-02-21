package com.skt.wifi.mgr.login.persistence;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.skt.wifi.mgr.login.controller.HomeController;
import com.skt.wifi.mgr.login.domain.User;

@Repository
public class LoginDaoImpl implements LoginDao {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginDaoImpl.class);
	
	@Autowired
	SqlSessionFactory sqlSessionFactory;
	
	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub		
		User user ;
		
		logger.info("userId : {}.", userId);
		
		SqlSession session = sqlSessionFactory.openSession();
		try {
		  user = session.selectOne("com.skt.wifi.mgr.login.persistence.LoginMapper.selectUser",userId);
		} finally {
		  session.close();
		}
		
		logger.info("user.getUserId() : {}.", user.getUserId());
		
		return user;
	}

}
