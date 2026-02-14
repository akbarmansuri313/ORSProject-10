package com.rays.form;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ActivityLogDTO;

public class ActivityForm extends BaseForm {

	@NotNull(message = "Actvity Id is Required")
	@Min(1)
	private long activityId;

	@NotEmpty(message = "ActivityName is Required")
	private String activityName;

	@NotEmpty(message = "PerformedBy is Required")
	private String performedBy;

	@NotNull(message = "Local Date is required")
	private Date activityTime;

	@NotEmpty(message = "ActivityStatus is Required")
	private String activityStatus;

	public long getActivityId() {
		return activityId;
	}

	public void setActivityId(long activityId) {
		this.activityId = activityId;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getPerformedBy() {
		return performedBy;
	}

	public void setPerformedBy(String performedBy) {
		this.performedBy = performedBy;
	}

	public Date getActivityTime() {
		return activityTime;
	}

	public void setActivityTime(Date activityTime) {
		this.activityTime = activityTime;
	}

	public String getActivityStatus() {
		return activityStatus;
	}

	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}

	@Override
	public BaseDTO getDto() {

		ActivityLogDTO dto = initDTO(new ActivityLogDTO());

		dto.setActivityId(activityId);
		dto.setActivityName(activityName);
		dto.setPerformedBy(performedBy);
		dto.setActivityStatus(activityStatus);
		dto.setActivityTime(activityTime);
		return dto;
	}

}
