/*
 * @(#)StrategySolver.java
 *
 * Copyright (c) 2016 Southwest Airlines, Co.
 * 2702 Love Field Drive, Dallas, TX 75235, U.S.A.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Southwest Airlines, Co.
 */
package com.swacorp.training;

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.support.GenericXmlApplicationContext;

public class StrategySolver {

	public static StrategyResult messageDecode(String status, String message) {

		GenericXmlApplicationContext appCtx = new GenericXmlApplicationContext();
		appCtx.load("classpath:xml-bean-factory-config.xml");
		appCtx.refresh();

		if (isComplete(status, message)) {
			return appCtx.getBean("complete", ResponseStrategy.class).decode();
		} else if (isBunisess(status, message)) {
			return appCtx.getBean("bunisess", ResponseStrategy.class).decode();
		} else if (isBadRequest(status, message)) {
			return appCtx.getBean("badRequest", ResponseStrategy.class).decode();
		} else if (isServerError(status, message)) {
			return appCtx.getBean("serverError", ResponseStrategy.class).decode();
		}
		return null;

	}

	private static boolean isServerError(String status, String message) {
		String fline = StringUtils.substringBefore(message, "\n");
		return StringUtils.substringAfterLast(fline, ":").trim().equals(Constants.ERROR_NOT_MESSAGE)
				|| fline.trim().equals(Constants.ERROR_NOT_MESSAGE) || status.equals(Constants.SERVER_ERROR);
	}

	private static boolean isBadRequest(String status, String message) {
		String fline = StringUtils.substringBefore(message, "\n");
		return (fline.contains("xpath=null") && fline.contains("java.lang.NullPointerException"));
	}

	private static boolean isBunisess(String status, String message) {
		return StringUtils.substringBefore(message, "\n").contains("Errors");
	}

	private static boolean isComplete(String status, String message) {
		return status.equals("COMPLETE");
	}

}
