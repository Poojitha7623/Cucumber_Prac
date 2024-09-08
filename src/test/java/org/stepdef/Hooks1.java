package org.stepdef;

import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks1 extends BaseCls {
	
	@Before 
	private void Bfr() {
		// TODO Auto-generated method stub
System.out.println("Before");

edgeBrowser();
maxwindow();
	}
	
	
	@After
	
	private void aftr(Scenario s) {
		// TODO Auto-generated method stub

		if (s.isFailed()) {
			
			TakesScreenshot ts = ()
		}
		
		
	}

}
