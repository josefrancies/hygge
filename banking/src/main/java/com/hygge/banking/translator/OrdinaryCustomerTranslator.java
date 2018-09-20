package com.hygge.banking.translator;

import java.math.BigDecimal;

import com.hygge.banking.model.BankingCustomerModel;
import com.hygge.banking.util.CoreBankingInterface;

public class OrdinaryCustomerTranslator implements CoreBankingInterface{
	
	public void credit(BankingCustomerModel creditCus, float transferAmt){
		BigDecimal bal = new BigDecimal(transferAmt);
		bal =  bal.add(creditCus.getActBalance());
		creditCus.setActBalance(bal);				
	}
	
	public void debit(BankingCustomerModel debitCus, float transferAmt){
		BigDecimal bal = new BigDecimal(transferAmt);
		debitCus.setActBalance(debitCus.getActBalance().subtract(bal));
	}
	
	public void transaction(BankingCustomerModel fromCus, BankingCustomerModel toCus, float transferAmt){
		credit(toCus, transferAmt);
		debit(fromCus, transferAmt);
		System.out.println("Bal after credit for "+toCus.getName()+" is "+toCus.getActBalance());
		System.out.println("Bal after debit for "+fromCus.getName()+" is "+fromCus.getActBalance());
	}
}
