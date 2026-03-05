package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_appointment")
public class AppointmentDTO extends BaseDTO {

	@Column(name = "patientName")
	private String patientName;

	@Column(name = "appointmentDate")
	private Date appointmentDate;

	@Column(name = "status")
	private String status;

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getUniqueKey() {

		return "patientName";
	}

	@Override
	public String getUniqueValue() {

		return patientName;
	}

	@Override
	public String getLabel() {
		return "Patient Name";
	}

	@Override
	public String getTableName() {
		return "patientName";
	}

}
