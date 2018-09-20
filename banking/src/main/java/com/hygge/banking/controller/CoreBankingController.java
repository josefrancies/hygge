package com.hygge.banking.controller;

import com.hygge.banking.model.BankingCustomerModel;
import com.hygge.banking.translator.OrdinaryCustomerTranslator;
import com.hygge.banking.translator.PrivilageCustomerTranslator;
import com.hygge.banking.util.CoreBankingInterface;

public class CoreBankingController{

	public void transactionCntrl(BankingCustomerModel fromCus, BankingCustomerModel toCus, boolean isPrivilageCus, float transferAmt){
		CoreBankingInterface cbi;
		if(isPrivilageCus){
			 cbi = new PrivilageCustomerTranslator();
		}else{
			 cbi = new OrdinaryCustomerTranslator();
		}
		cbi.transaction(fromCus, toCus, transferAmt);
	}
	
}
