package com.skt.wifi.mgr.login.persistence;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.skt.wifi.mgr.login.domain.Admin;
import com.skt.wifi.mgr.login.domain.User;

@Repository
public class AdminDaoImpl implements AdminDao  {
	private static final Logger logger = LoggerFactory
			.getLogger(AdminDaoImpl.class);

	@Autowired
	SqlSession sqlSession;

	@Override
	public Admin getAdmin(Admin admin) {
		logger.info("getAdminObject() Start");
		Admin resultList = null;
		resultList = sqlSession.selectOne("com.skt.wifi.mgr.login.persistence.AdminMapper.selectAdmin", admin);

		return resultList;
	}


	@Override
	public int insertAdmin(Admin admin) {
		logger.info("insertAdmin() Start");
		int result = sqlSession.insert("com.skt.wifi.mgr.login.persistence.AdminMapper.insertAdmin", admin);
		logger.info("result = {} " , result);
		return result;
	}

	@Override
	public int updateAdmin(Admin admin) {
		logger.info("updateAdmin() Start");		
		int result = sqlSession.update("com.skt.wifi.mgr.login.persistence.AdminMapper.updateAdmin",admin);
		logger.info("result = {} " , result);
		return result;
	}

	@Override
	public int deleteAdmin(Admin admin) {
		logger.info("deleteAdmin() Start");		
		int result = sqlSession.delete("com.skt.wifi.mgr.login.persistence.AdminMapper.deleteAdmin",admin);
		logger.info("result = {} " , result);
		return result;
	}

	@Override
	public List<Admin> getAdminList(Admin admin) {
		logger.info("getAdminObject() Start");
		List<Admin> resultList = null;
		resultList = sqlSession.selectList("com.skt.wifi.mgr.login.persistence.AdminMapper.selectAdminList", admin);
		return resultList;
	}

}
