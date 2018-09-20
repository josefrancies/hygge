package com.hygge.banking.util;

import com.hygge.banking.model.BankingCustomerModel;

public interface CoreBankingInterface {

	public void credit(BankingCustomerModel creditCus, float transferAmt);
	public void debit(BankingCustomerModel debitCus, float transferAmt);
	public void transaction(BankingCustomerModel fromCus, BankingCustomerModel toCus, float transferAmt);
}
