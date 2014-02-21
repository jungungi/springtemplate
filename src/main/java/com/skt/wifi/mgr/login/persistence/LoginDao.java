package com.skt.wifi.mgr.login.persistence;

import com.skt.wifi.mgr.login.domain.User;

public interface LoginDao {
	public User getUser(String userId);

}
