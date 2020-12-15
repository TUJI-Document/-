package org.mypro.entity;

public class Submitter {
	private Integer id;

	private String name;

	private String email;

	private String tel;

	private String wxnum;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel == null ? null : tel.trim();
	}

	public String getWxnum() {
		return wxnum;
	}

	public void setWxnum(String wxnum) {
		this.wxnum = wxnum == null ? null : wxnum.trim();
	}
}