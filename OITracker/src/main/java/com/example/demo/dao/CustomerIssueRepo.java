package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CustomerIssue;

public interface CustomerIssueRepo extends JpaRepository<CustomerIssue, Integer>{

	
}
