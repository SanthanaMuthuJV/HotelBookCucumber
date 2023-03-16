package org.testrunnercucu;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JVMRepo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="@Rerun\\failed.txt",
glue="org.stepdefinition",
monochrome=true,dryRun=false,

plugin= {"rerun:C:\\Users\\USER\\eclipse-workspace\\MavenCu\\Rerun\\failed.txt"})

public class RerunFailCase {
	
	@AfterClass
	public static void failRerun() {
		
		JVMRepo.repo("C:\\Users\\USER\\eclipse-workspace\\MavenCu\\Json\\fb.json");
		System.out.println("jvm 22report created");
		
	}
}
