package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	private int cid;

	private String cname;

	private String cadd;

	private String pnum;

	private String lid;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCadd() {
		return cadd;
	}

	public void setCadd(String cadd) {
		this.cadd = cadd;
	}

	public String getPnum() {
		return pnum;
	}

	public void setPnum(String pnum) {
		this.pnum = pnum;
	}

	public String getLid() {
		return lid;
	}

	public void setLid(String lid) {
		this.lid = lid;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cadd=" + cadd + ", pnum=" + pnum + ", lid=" + lid + "]";
	}

}
