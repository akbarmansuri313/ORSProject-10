package com.rays.dto;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_activity")
public class ActivityLogDTO extends BaseDTO {

	@Column(name = "activityId")
	private long activityId;

	@Column(name = "activityName", length = 50)
	private String activityName;

	@Column(name = "performedBy", length = 50)
	private String performedBy;

	@Column(name = "activityTime", length = 50)
	private Date activityTime;

	@Column(name = "activityStatus", length = 50)
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
	public String getUniqueKey() {
		return "activityName";
	}

	@Override
	public String getUniqueValue() {
		return activityName;
	}

	@Override
	public String getLabel() {

		return activityName;
	}

	@Override
	public String getTableName() {
		return "Activity";
	}

	
}
