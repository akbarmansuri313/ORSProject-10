package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.AppointmentDTO;

public class AppointmentForm extends BaseForm {

	@NotEmpty(message = "Patient Name is Required")
	private String patientName;

	@NotNull(message = "Appointment Date is Required")
	private Date appointmentDate;

	@NotEmpty(message = "status is Required")
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
	public BaseDTO getDto() {

		AppointmentDTO dto = initDTO(new AppointmentDTO());

		dto.setPatientName(patientName);
		dto.setAppointmentDate(appointmentDate);
		dto.setStatus(status);

		return dto;

	}

}
