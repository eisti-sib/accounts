package org.bouche.training.sample.accounts;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.bouche.training.sample.accounts.model.BankChargeOperation;
import org.bouche.training.sample.accounts.model.CurrentAccount;
import org.bouche.training.sample.accounts.model.TransferOperation;

public class MainClass {

	public static void main(String[] args) {

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		// Create account number 1234 5678
		CurrentAccount account1 = new CurrentAccount("1234 5678");

		// Create account number 9876 5432
		CurrentAccount account2 = new CurrentAccount("9876 5432");

		account1.addOperation(new TransferOperation(new BigDecimal("900.00"), df.parse("2019-09-04"), "Initial Deposit"));
		account2.addOperation(new TransferOperation(new BigDecimal("500.00"), df.parse("2019-09-05"), "Initial Deposit"));
		account1.addOperation(new TransferOperation(new BigDecimal("-500.00"), df.parse("2019-09-16"), "Car Insurance"));
		account1.addOperation(new TransferOperation(new BigDecimal("-250.00"), df.parse("2019-09-27"), "Electronic store"));
		account1.addOperation(new BankChargeOperation(new BigDecimal("-19.50"), df.parse("2019-10-01"), "Banking services monthly subscription"));
		account2.addOperation(new BankChargeOperation(new BigDecimal("-19.50"), df.parse("2019-10-01"), "Banking services monthly subscription"));
		account1.addOperation(new TransferOperation(new BigDecimal("2540.50"), df.parse("2019-10-02"), "Salary"));
		
		// Display the list of operations for account1 between September 15th, 2019 and October 15th, 2019
		
		// Display the balance of account1 on September 29th, 2019
		
	}
	
}
