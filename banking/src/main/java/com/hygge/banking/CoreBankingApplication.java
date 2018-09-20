package com.hygge.banking;

import java.math.BigDecimal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hygge.banking.controller.CoreBankingController;
import com.hygge.banking.model.BankingCustomerModel;

//@SpringBootApplication
public class CoreBankingApplication {

	public static void main(String[] args) {
		//SpringApplication.run(CoreBankingApplication.class, args);
		BankingCustomerModel fromCus = new BankingCustomerModel("Jose", new BigDecimal("2000.2345"), 28, 1500.00f); 
		BankingCustomerModel toCus = new BankingCustomerModel("Abin", new BigDecimal("4500.876"), 30, 3000.987f);
		boolean isPrivilageCus = true;
		float transferAmt = 500.02f;
		CoreBankingController operation = new CoreBankingController();
		operation.transactionCntrl(fromCus, toCus, isPrivilageCus, transferAmt);
	}
}
