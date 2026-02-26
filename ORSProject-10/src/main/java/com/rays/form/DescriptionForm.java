package com.rays.form;

import java.math.BigDecimal;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.DescriptionDTO;

public class DescriptionForm extends BaseForm {

	@NotNull(message = "Id is Required")
	@Min(1)
	private Long itemId;

	@NotEmpty(message = "Item Code isRequired ")
	private String itemCode;

	@NotEmpty(message = "Item Name isRequired ")
	private String itemName;

	@NotEmpty(message = "Quantity is Required")
	private Integer quantity;

	@NotEmpty(message = "Price is Required")
	private BigDecimal price;

	@NotEmpty(message = "Item Status is Required")
	private String itemStatus;
	
	
	@Override
	public BaseDTO getDto() {


		DescriptionDTO dto = initDTO(new DescriptionDTO());
		
		dto.setItemId(itemId);
		dto.setItemCode(itemCode);
		dto.setItemName(itemName);
		dto.setQuantity(quantity);
		dto.setPrice(price);
		dto.setItemStatus(itemStatus);
		
		return dto;
	}

}
