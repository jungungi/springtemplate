package com.skt.wifi.mgr.login.domain;

import java.util.Date;

public class Admin {
	private String admin_id;
	private String password;
	private String admin_nm;
	private String use_yn;
	private String admin_group;
	private String cre_id;
	private Date cre_dtd;
	private String upd_id;
	private Date upd_dtd;
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAdmin_nm() {
		return admin_nm;
	}
	public void setAdmin_nm(String admin_nm) {
		this.admin_nm = admin_nm;
	}
	public String getUse_yn() {
		return use_yn;
	}
	public void setUse_yn(String use_yn) {
		this.use_yn = use_yn;
	}
	public String getAdmin_group() {
		return admin_group;
	}
	public void setAdmin_group(String admin_group) {
		this.admin_group = admin_group;
	}
	public String getCre_id() {
		return cre_id;
	}
	public void setCre_id(String cre_id) {
		this.cre_id = cre_id;
	}
	public Date getCre_dtd() {
		return cre_dtd;
	}
	public void setCre_dtd(Date cre_dtd) {
		this.cre_dtd = cre_dtd;
	}
	public String getUpd_id() {
		return upd_id;
	}
	public void setUpd_id(String upd_id) {
		this.upd_id = upd_id;
	}
	public Date getUpd_dtd() {
		return upd_dtd;
	}
	public void setUpd_dtd(Date upd_dtd) {
		this.upd_dtd = upd_dtd;
	}

	
}
