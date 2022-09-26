package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerIssue {

	@Id
	private int issueid;
	private String issuedate;
	private int cid;
	private String issuecat;
	private String issuedesc;

	public int getIssueid() {
		return issueid;
	}

	public void setIssueid(int issueid) {
		this.issueid = issueid;
	}

	public String getIssuedate() {
		return issuedate;
	}

	public void setIssuedate(String issuedate) {
		this.issuedate = issuedate;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getIssuecat() {
		return issuecat;
	}

	public void setIssuecat(String issuecat) {
		this.issuecat = issuecat;
	}

	public String getIssuedesc() {
		return issuedesc;
	}

	public void setIssuedesc(String issuedesc) {
		this.issuedesc = issuedesc;
	}

	@Override
	public String toString() {
		return "CustomerIssue [issueid=" + issueid + ", issuedate=" + issuedate + ", cid=" + cid + ", issuecat="
				+ issuecat + ", issuedesc=" + issuedesc + "]";
	}

}
