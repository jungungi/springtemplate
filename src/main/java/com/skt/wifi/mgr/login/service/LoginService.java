package com.skt.wifi.mgr.login.service;

import java.util.List;
import java.util.Map;

import com.skt.wifi.mgr.login.domain.Admin;
import com.skt.wifi.mgr.login.domain.User;

public interface LoginService {	
	public User doSomeBusinessStuff(String userId);
	public Map<String, Object>   getAdmin();
	public Admin getAdminObject();
}
