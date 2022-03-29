package com.shop.customers;

public class customers {
	private String fName;
	private String lName;
	private int age;
	private static int noOfCustomers = 0;
	private static final String companyName = "QA Community";
	
	public customers() {
		
	}
	
	public customers(String fName, String lName, int age) {
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		noOfCustomers+=1;
	}

	public static int getNoOfCustomers() {
		return noOfCustomers;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static String getCompanyname() {
		return companyName;
	}
	
	
	
	

}
