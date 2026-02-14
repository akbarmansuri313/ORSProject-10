package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_department")
public class DepartmentDTO extends BaseDTO {

	@Column(name = "departmentId")
	private Long departmentId;

	@Column(name = "departmentCode")
	private String departmentCode;

	@Column(name = "departmentName")
	private String departmentName;

	@Column(name = "headName")
	private String headName;

	@Column(name = "departmentStatus")
	private String departmentStatus;

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getHeadName() {
		return headName;
	}

	public void setHeadName(String headName) {
		this.headName = headName;
	}

	public String getDepartmentStatus() {
		return departmentStatus;
	}

	public void setDepartmentStatus(String departmentStatus) {
		this.departmentStatus = departmentStatus;
	}

	@Override
	public String getUniqueKey() {

		return "departmentCode";
	}

	@Override
	public String getUniqueValue() {
		return departmentCode;
	}

	@Override
	public String getLabel() {
		return "departmentCode";
	}

	@Override
	public String getTableName() {
		return "Department";
	}

}
