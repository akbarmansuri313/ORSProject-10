package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_notification")
public class NotificationDTO extends BaseDTO {

	@Column(name = "notificationId", length = 50)
	private Long notificationId;

	@Column(name = "title", length = 50)
	private String title;

	@Column(name = "message", length = 50)
	private String message;

	@Column(name = "sentDate", length = 50)
	private Date sentDate;

	@Column(name = "isRead", length = 30)
	private Boolean isRead;

	public Long getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(Long notificationId) {
		this.notificationId = notificationId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getSentDate() {
		return sentDate;
	}

	public void setSentDate(Date sentDate) {
		this.sentDate = sentDate;
	}

	public Boolean getIsRead() {
		return isRead;
	}

	public void setIsRead(Boolean isRead) {
		this.isRead = isRead;
	}

	@Override
	public String getUniqueKey() {

		return "title";
	}

	@Override
	public String getUniqueValue() {

		return "title";
	}

	@Override
	public String getLabel() {
		return title;
	}

	@Override
	public String getTableName() {
		return "Notification";
	}

}
