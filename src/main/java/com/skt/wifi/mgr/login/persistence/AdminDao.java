package com.skt.wifi.mgr.login.persistence;

import java.util.List;
import java.util.Map;

import com.skt.wifi.mgr.login.domain.Admin;

public interface AdminDao {
	public List<Admin> getAdminList(Admin admin);
	public Admin getAdmin(Admin admin);
	public int insertAdmin(Admin admin);
	public int updateAdmin(Admin admin);
	public int deleteAdmin(Admin admin);
}
