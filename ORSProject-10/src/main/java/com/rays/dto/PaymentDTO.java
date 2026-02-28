package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_payment")
public class PaymentDTO extends BaseDTO {

	@Column(name = "paymentId")
	private Long paymentId;

	@Column(name = "amount", length = 50)
	private Double amount;

	@Column(name = "paymentDate", length = 50)
	private Date paymentDate;

	@Column(name = "paymentMode", length = 50)
	private String paymentMode;

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	@Override
	public String getUniqueKey() {
		return paymentMode;
	}

	@Override
	public String getUniqueValue() {
		return "paymentMode";
	}

	@Override
	public String getLabel() {
		return "paymentMode";
	}

	@Override
	public String getTableName() {
		return "Payment";
	}

}
