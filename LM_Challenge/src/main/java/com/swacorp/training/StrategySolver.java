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

import java.util.ArrayList;
import java.util.List;

import com.swacorp.training.strategy.BadRequestStrategy;
import com.swacorp.training.strategy.BunisessExceptionStrategy;
import com.swacorp.training.strategy.CompleteStrategy;
import com.swacorp.training.strategy.ResponseStrategy;
import com.swacorp.training.strategy.ServerErrorStrategy;

public class StrategySolver {

   private List<ResponseStrategy> strategies;

   public StrategySolver(String status, String message) {
	   System.out.println("Creando el objeto StrategySolver");
	   strategies = new ArrayList<ResponseStrategy>();
      initializeStrategies(status, message);
   }

   public StrategyResult messageDecode() {
	  
      for (ResponseStrategy strategy : strategies) {
         if (strategy.isImplementable()) { return strategy.decode(); }
      }

      return null;

   }

   private void initializeStrategies(String status, String message) {
	   System.out.println("Inicializando la estrategia");
      ResponseStrategy complete = new CompleteStrategy(status, message);
      ResponseStrategy bunisess = new BunisessExceptionStrategy(status, message);
      ResponseStrategy badRequest = new BadRequestStrategy(status, message);
      ResponseStrategy serverError = new ServerErrorStrategy(status, message);
      strategies.add(complete);
      strategies.add(bunisess);
      strategies.add(badRequest);
      strategies.add(serverError);
   }

}
