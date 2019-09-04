package org.bouche.training.sample.accounts.model;

import java.math.BigDecimal;
import java.util.Date;

public interface IOperation {

	public String getLabel();
	
	public OperationTypeEnum getOperationType();
	
	public BigDecimal getAmount();
	
	public Date getOperationDate();
	
	public OperationStatusEnum getStatus();
	
}
