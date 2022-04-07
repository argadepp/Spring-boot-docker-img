package com.example.demoexample.HelloWorld.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
	
	@Id
	private int uid ;
	private  String fname ;
	private String lname ;
	private String mobno;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public Users(int uid, String fname, String lname, String mobno) {
		super();
		this.uid = uid;
		this.fname = fname;
		this.lname = lname;
		this.mobno = mobno;
	}
	public Users() {
		
	}
	@Override
	public String toString() {
		return "Users [uid=" + uid + ", fname=" + fname + ", lname=" + lname + ", mobno=" + mobno + "]";
	}
	
	

}
