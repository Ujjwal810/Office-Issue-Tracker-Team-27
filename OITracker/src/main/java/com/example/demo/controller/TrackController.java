package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.CustomerIssueRepo;
import com.example.demo.dao.CustomerRepo;
import com.example.demo.model.Customer;
import com.example.demo.model.CustomerIssue;

@Controller
public class TrackController {

	@Autowired
	CustomerRepo repo;

	@Autowired
	CustomerIssueRepo repo1;

	@RequestMapping("/hi")
	public String home(@ModelAttribute("customer") Customer custom) {
		return "Home";
	}

	@RequestMapping("/login")
	public String add(@ModelAttribute("customer") Customer custom) {
		repo.save(custom);
		return "login";
	}

	@RequestMapping("/issue")
	public String issue1(@RequestParam("ticket") String tick, Model m) {
		if (tick.equals("rissue")) {
			return "rissue_form";
		} else {
			return "vissue_form";
		}
	}

	@RequestMapping("/issueview")
	public String addissue(@ModelAttribute("customer") CustomerIssue cissue, Model m) {
		repo1.save(cissue);
		m.addAttribute("issueid", cissue.getIssueid());
		m.addAttribute("issuedate", cissue.getIssuedate());
		m.addAttribute("cid", cissue.getCid());
		m.addAttribute("issuecat", cissue.getIssuecat());
		m.addAttribute("issuedesc", cissue.getIssuedesc());
		return "success";
	}

	@RequestMapping("/iview2")
	public String fetchissue(@RequestParam("issueid") int issueid, Model m) {
		CustomerIssue c = repo1.getOne(issueid);
		m.addAttribute("issueid", c.getIssueid());
		m.addAttribute("issuedate", c.getIssuedate());
		m.addAttribute("cid", c.getCid());
		m.addAttribute("issuecat", c.getIssuecat());
		m.addAttribute("issuedesc", c.getIssuedesc());
		return "success1";
	}

}
