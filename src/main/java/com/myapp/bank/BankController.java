package com.myapp.bank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/bank")

public class BankController {
	

	@Autowired
	BankService bankSer;
	@PostMapping(value = "/add")
	public String addProduct(@RequestBody List<Bank> b) {
		return bankSer.addBank(b);
	}
	
	@GetMapping(value = "/find")
	public List<Bank> findBanks() {
		return bankSer.findBanks();
	}
		
		
		 @GetMapping(value = "/getIfscByBranches/{branch}")
	     public  Integer getIfscByBranch(@PathVariable String branch){
	    	 return bankSer.getIfscByBranch(branch);




}
}
