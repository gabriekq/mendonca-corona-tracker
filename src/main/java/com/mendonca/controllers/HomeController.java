package com.mendonca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mendonca.model.LocationStats;
import com.mendonca.services.CoronaVirusDataService;

@Controller
public class HomeController {

	@Autowired
	CoronaVirusDataService coronaVirusDataService;
	
	
	@GetMapping("/")
	public String home(Model model) {
		
		
	List<LocationStats> allStats =	coronaVirusDataService.getAllStats() ;
    int totalReportedCases = allStats.stream().mapToInt(star -> star.getLatestTotalCases()).sum();
    int totalNewCases = allStats.stream().mapToInt(star -> star.getDiffFromPrevDay()).sum();
		
		model.addAttribute("totalNewCases",totalNewCases );
		model.addAttribute("totalReportedCases",totalReportedCases );
		model.addAttribute("locationStats", allStats  );
		return "home";
	}
	
	
	
}
