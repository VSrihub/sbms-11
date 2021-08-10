package com.medilab.preclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DashboardController {
	
	@RequestMapping("dashboard")
	public String viewDashboard() {
		System.out.println("****************************");
		return "dashboard";
	}
}
