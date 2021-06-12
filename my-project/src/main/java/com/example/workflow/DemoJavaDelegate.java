package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class DemoJavaDelegate implements JavaDelegate {
	
	public void execute(DelegateExecution execution) throws Exception {
	      System.out.println("Service Task called....");
	      
	      
	    }

}
