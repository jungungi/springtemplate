package com.skt.wifi.mgr.login.service;

import java.util.List;

import com.skt.wifi.mgr.login.domain.Admin;

public interface AdminService {
	public Admin getAdmin(Admin admin);
	public List<Admin> getAdminList(Admin admin);	
	public int insertAdmin(Admin admin);
	public int updateAdmin(Admin admin); 
	public int deleteAdmin(Admin admin);	
}
