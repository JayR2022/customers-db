package com.shop.customers;


public class Main {
	
	public static void main(String[] args) {
		customers customer1 = new customers("Thomas","Shelby",45);
		customers customer2 = new customers("Charles","Dickens",55);
		System.out.println("Customer1 is: " +customer1.getfName()+customer1.getlName()+" Age is "+customer1.getAge());
		System.out.println("No of customers in db  "+customers.getNoOfCustomers());
	}

}
