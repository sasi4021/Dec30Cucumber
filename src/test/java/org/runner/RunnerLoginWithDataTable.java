
package org.runner;

import org.base.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Feature/loginWithDataTable.feature"},
				 glue = "org.stepdefinitions",
				 dryRun= false,
				 tags= "@sanity and @smoke",
				 monochrome=true,
			//	 plugin=("pretty") - prints on console
				// plugin=("usage") - prints in console with json format
				 //plugin= {"usage:usagereport.txt"} // - json values stored in text file
				  plugin= { "pretty",
				//  "html:src\\test\\resources\\Reports\\HtmlReport\\htmlreport.html",
				  "json:src\\test\\resources\\Reports\\JsonReport\\jsonreport.json",
				 // "junit:src\\test\\resources\\Reports\\JunitReport\\junitreport.xml"
						  
			  				}
		
				)

public class RunnerLoginWithDataTable {

	@AfterClass
	public static void report()
	{
		JVMReport.generateJVMReport("src\\test\\resources\\Reports\\JsonReport\\jsonreport.json");
		System.out.println("Report Generated");
	
	}
	
}
