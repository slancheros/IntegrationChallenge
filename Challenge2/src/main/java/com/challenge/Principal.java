package com.challenge;

public class Principal {

	public static void main(String[] args) {
		String a[] = new String[] {"simpleJob.xml","processFileJob"};

		try {
			org.springframework.batch.core.launch.support.CommandLineJobRunner.main(a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
