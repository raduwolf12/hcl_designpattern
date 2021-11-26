package com.example.demo;

import com.example.demo.model.Car;
import com.example.demo.model.GasEngine;
import com.example.demo.model.impl.CngEngine;
import com.example.demo.model.impl.GplEngine;

public class EngineAdapter implements Car {

	GasEngine gasEngine;

	   public EngineAdapter(String fuel){
	   
	      if(fuel.equalsIgnoreCase("gpl") ){
	    	  gasEngine = new GplEngine();			
	         
	      }else if (fuel.equalsIgnoreCase("cng")){
	    	  gasEngine = new CngEngine();
	      }	
	   }


	@Override
	public void fillUpTank(String fuel) {
		if(fuel.equalsIgnoreCase("gpl") ){
	    	  gasEngine.fillUpGas();			
	         
	      }else if (fuel.equalsIgnoreCase("cng")){
	    	  gasEngine.fillUpGas();
	      }	
	}

	@Override
	public void checkEngine() {
		System.out.println("Dual engine");
	}

}
