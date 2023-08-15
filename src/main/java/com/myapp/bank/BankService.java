package com.myapp.bank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


@Service
public class BankService {
	
	@Autowired
	BankDao  bankDao;

	public String addBank(List<Bank> p) {

		return bankDao.addBank(p);
	}
	public List<Bank> findBanks() {
		return bankDao.findBanks();

	}
	public  Integer getIfscByBranch(@PathVariable String branch){
   	 return bankDao.getIfscByBranch(branch);

}
}



