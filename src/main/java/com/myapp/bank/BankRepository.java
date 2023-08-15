package com.myapp.bank;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



		
public interface BankRepository extends JpaRepository<Bank,Integer> {
	
	@Query(value = "select ifsccode from bank_details where branch=?",nativeQuery = true)
	public int getIfscByBranch(String branch);
	

		}






