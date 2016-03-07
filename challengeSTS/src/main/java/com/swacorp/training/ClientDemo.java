package com.swacorp.training;

public class ClientDemo {

	public static void main(String... args) {
		StrategyResult result = StrategySolver.messageDecode("COMPLETE", "sOME MESSAGE");
		System.out.println(result.getResponseType());
		System.out.println(result.getResponseDescription());
	}
}
