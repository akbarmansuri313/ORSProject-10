package com.rays.common;

import java.util.HashMap;

public class ORSResponse {

	private static final String INPUT_ERROR = "inputerror";

	private static final String DATA = "data";

	private static final String MESSAGE = "message";

	private boolean success = false;

	private HashMap<String, Object> result = new HashMap<String, Object>();

	public ORSResponse() {

	}

	public ORSResponse(boolean success) {
		this.success = success;
	}

	public ORSResponse(boolean success, String message) {
		this.success = success;
		addMessage(message);
	}

	public ORSResponse(boolean success, String message, Object value) {
		this.success = success;
		addMessage(message);
		addData(value);
	}

	public void isSuccess(boolean success) {
		this.success = success;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public HashMap<String, Object> getResult() {
		return result;
	}

	public void setResult(HashMap<String, Object> result) {
		this.result = result;
	}

	public static String getInputError() {
		return INPUT_ERROR;
	}

	public static String getData() {
		return DATA;
	}

	public static String getMessage() {
		return MESSAGE;
	}

	public void addData(Object value) {
		result.put(DATA, value);

	}

	public void addMessage(Object value) {
		result.put(MESSAGE, value);
	}

	public void addInputMessage(Object value) {
		result.put(INPUT_ERROR, value);
	}

	public void addResult(String key, Object value) {

		result.put(key, value);
	}

}
