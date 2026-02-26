package com.rays.form;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.PaymentDTO;

public class PaymentForm extends BaseForm {

	@NotNull(message = "Payment Id Is required")
	@Min(1)
	private Long paymentId;

	@NotNull(message = "Payment Amount is required")
	private Double amount;

	@NotNull(message = "Payment Date is required")
	private Date paymentDate;

	@NotEmpty(message = "Payment Mode Is required")
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
	public BaseDTO getDto() {

		PaymentDTO dto = initDTO(new PaymentDTO());

		dto.setPaymentId(paymentId);

		dto.setPaymentMode(paymentMode);
		dto.setPaymentDate(paymentDate);
		dto.setAmount(amount);
		return dto;
	}

}
