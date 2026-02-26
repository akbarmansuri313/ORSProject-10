package com.rays.dto;

import java.math.BigDecimal;

import com.rays.common.BaseDTO;

public class DescriptionDTO  extends BaseDTO{
	
	private Long itemId;
	
	private String itemCode;
	
	private String itemName;
	
	private Integer quantity;
	
	private BigDecimal price;
	
	private String itemStatus;

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}

	@Override
	public String getUniqueKey() {

		return "itemCode";
	}

	@Override
	public String getUniqueValue() {
		return itemCode;
	}

	@Override
	public String getLabel() {

		return itemCode;
	}

	@Override
	public String getTableName() {
		return "Description";
	}
	

}
