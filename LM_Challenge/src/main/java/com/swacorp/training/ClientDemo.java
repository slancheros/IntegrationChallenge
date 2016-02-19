package com.swacorp.training;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClientDemo {


	private static Logger log = LogManager.getLogger("im-ITOPS_APPENDER");
	
	public static void main(String ...args){
		   StrategySolver solver = new StrategySolver("COMPLETE", "sOME MESSAGE");
	       StrategyResult result = solver.messageDecode();
	       log.info("Starting");
	       System.out.println(result.getResponseType());
	       System.out.println(result.getResponseDescription());
	}
}
