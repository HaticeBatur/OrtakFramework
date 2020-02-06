package com.ortak.testbase;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetailsPageElements;
import com.hrms.pages.ReportsPageElements;

public class PageInitializer extends BaseClass{
	public static LoginPageElements login;
	public static DashboardPageElements dashboard;
	public static AddEmployeePageElements addEmp;
	public static PersonalDetailsPageElements pdetails;
	public static ReportsPageElements report;
	
	public static void initializeAllPage() {
		login=new LoginPageElements();
		dashboard=new DashboardPageElements();
		addEmp=new AddEmployeePageElements();
		pdetails=new PersonalDetailsPageElements();
		report=new ReportsPageElements();
	}
	
<<<<<<< HEAD
	public void print() {
		System.out.println("Print smt");
	}
=======
	
>>>>>>> 6fc9ef73f645c148ef68098d5bbcf0704f77ea36
}
