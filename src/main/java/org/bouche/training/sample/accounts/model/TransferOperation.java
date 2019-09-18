package org.bouche.training.sample.accounts.model;

import java.math.BigDecimal;
import java.util.Date;

public class TransferOperation implements IOperation {

	private String label;
	private BigDecimal amount;
	private Date operationDate;
	private OperationStatusEnum status;
	
	public TransferOperation(BigDecimal amount, Date operationDate, String label) {
		super();
		this.label = label;
		this.amount = amount;
		this.operationDate = operationDate;
		this.status = OperationStatusEnum.PENDING;
	}

	@Override
	public String getLabel() {
		return label;
	}

	@Override
	public OperationTypeEnum getOperationType() {
		return OperationTypeEnum.TRANSFER;
	}

	@Override
	public BigDecimal getAmount() {
		return amount;
	}

	@Override
	public Date getOperationDate() {
		return operationDate;
	}

	@Override
	public OperationStatusEnum getStatus() {
		return status;
	}
	
}
