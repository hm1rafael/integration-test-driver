package com.github.hm1rafael.logger;

public class Logger {

	private static java.util.logging.Logger logger = java.util.logging.Logger.getLogger("integration-test-driver-logger");
	
	public static java.util.logging.Logger getLogger() {
		return logger;
	}
	
}
