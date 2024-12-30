package org.base;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport  {

	
	public static void generateJVMReport(String json)
	{
		
		
		File loc = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JVMReport");
		
		Configuration con = new Configuration(loc, "Target");
		
		List<String> jsonFiles = new LinkedList<String>();
		
		jsonFiles.add(json);
		
		ReportBuilder r = new ReportBuilder(jsonFiles, con);
		
		r.generateReports();
		
		System.out.println("hello");
		System.out.println("world");	
		
	}
	
	
}
