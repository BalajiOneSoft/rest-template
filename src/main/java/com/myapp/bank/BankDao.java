package com.myapp.bank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;




@Repository
public class BankDao {

	
		
		@Autowired
		BankRepository bankRepo;

		public String addBank(List<Bank> b) {

			bankRepo.saveAll(b);
			return "successfully added";
		}
		public List<Bank> findBanks() {
			return bankRepo.findAll();

	}
		 public Integer getIfscByBranch(String branch){
			 
			 return bankRepo.getIfscByBranch(branch);
			 


	}
}


