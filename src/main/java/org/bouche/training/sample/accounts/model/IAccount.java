package org.bouche.training.sample.accounts.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface IAccount {

	public BigDecimal getBalance(Date date);
	
	public void addOperation(IOperation operation);
	
	public String getAccountNumber();
	
	public List<IOperation> getOperations();
	
	public List<IOperation> getOperations(Date startDate, Date endDate);
	
}
