package org.bouche.training.sample.accounts.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class CurrentAccount implements IAccount {

	private List<IOperation> operations;
	
	public CurrentAccount() {
		
	}
	
	@Override
	public void addOperation() {
		// TODO Auto-generated method stub
	}

	@Override
	public BigDecimal getBalance(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAccountNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IOperation> getOperations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IOperation> getOperations(Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		return null;
	}

}
