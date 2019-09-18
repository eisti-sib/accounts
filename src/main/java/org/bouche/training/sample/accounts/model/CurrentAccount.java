package org.bouche.training.sample.accounts.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CurrentAccount implements IAccount {

	private List<IOperation> operations = new ArrayList<IOperation>();
	
	private String accountNumber;
	
	public CurrentAccount(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public void addOperation(IOperation operation) {
		operations.add(operation);
	}

	@Override
	public BigDecimal getBalance(Date date) {
		BigDecimal result = BigDecimal.ZERO;
		Iterator<IOperation> it = operations.iterator();
		while(it.hasNext()) {
			IOperation operation = it.next();
			if(operation.getOperationDate().before(date)) {
				result = result.add(operation.getAmount());
			}
		}
		return result;
	}

	@Override
	public String getAccountNumber() {
		return accountNumber;
	}

	@Override
	public List<IOperation> getOperations() {
		return operations;
	}

	@Override
	public List<IOperation> getOperations(Date startDate, Date endDate) {
		List<IOperation> result = new ArrayList<IOperation>();
		
		Iterator<IOperation> it = operations.iterator();
		while(it.hasNext()) {
			IOperation operation = it.next();
			if(operation.getOperationDate().before(endDate) && operation.getOperationDate().after(startDate)) {
				result.add(operation);
			}
		}
		
		return result;
	}

}
