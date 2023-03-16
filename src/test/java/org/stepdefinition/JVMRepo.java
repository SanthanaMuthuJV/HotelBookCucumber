package org.stepdefinition;

import java.util.List;
import java.io.File;
import java.util.LinkedList;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMRepo {
	public static void repo(String passjsonrepo) {

		// 1.mention the target folder location-File
		File f = new File("C:\\Users\\USER\\eclipse-workspace\\MavenCu\\JvmReport");

		// 2. add details to the report using configuration class
		Configuration c = new Configuration(f, "QATool APPLICATION");
		c.addClassifications("platform", "windows");
		c.addClassifications("sprint", "1234");
		c.addClassifications("JDK Version", "1.8");

		// 3. add json file path into list<string>
		List<String> l = new LinkedList<String>();
		l.add(passjsonrepo);

		// 4.Create object for Report Builder Class
		ReportBuilder r = new ReportBuilder(l, c);

		// 5.Using the created object call generate Report()-m
		r.generateReports();

	}
}
