package org.testrunnercucu;


import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JVMRepo;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", 
                 glue = "org.stepdefinition", 
                 monochrome = true, 
                 dryRun = false,
                 snippets = SnippetType.CAMELCASE,
                 tags =  "@cell",
                 
               
                 plugin = {"pretty","html:HtmlReport",
                		 "junit:JunitReports\\face.xml",
                		 "json:Json\\fb.json",
                		 "rerun:C:\\Users\\USER\\eclipse-workspace\\MavenCu\\src\\test\\resources\\failed.txt"
                		  }
                  
                 )
                
public class TestRunnerClass {
@AfterClass
public static void postReport() {
	JVMRepo.repo("Json\\fb.json");
	System.out.println("jvm report created");

}

}

