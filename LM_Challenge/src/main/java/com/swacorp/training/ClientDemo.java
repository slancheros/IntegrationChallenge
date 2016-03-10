package com.swacorp.training;

import org.apache.log4j.Logger;

public class ClientDemo {

	private static Logger log = Logger.getLogger(ClientDemo.class);
	
	public static void main(String ...args){
		   StrategySolver solver = new StrategySolver("asd", "SOME MESSAGE");
	       StrategyResult result = solver.messageDecode();
	       log.info("Start");
	       if(result != null){
	    	   System.out.println(result.getResponseType());
	    	   System.out.println(result.getResponseDescription());
	       }else{
	    	   System.out.println("Strategy not found");
	       }
	}
}
