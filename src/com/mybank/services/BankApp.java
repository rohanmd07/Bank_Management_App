package com.mybank.services;
import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dear customer, Welcome to our e-banking facility");
		System.out.println("Please choose the type of service you want");
		System.out.println("1. Open Bank account");
		System.out.println("2. Withdraw money");
		System.out.println("3. Deposit money");
		System.out.println("4. Check Balance");
		int choice = scanner.nextInt();
		
		switch(choice) {
		 case 1: 
			 System.out.println("Please enter the type of bank account you want");
			 System.out.println("1. Saving account");
		     System.err.println("2. Current account");
		     int accountChoice = scanner.nextInt();
		     if(accountChoice==1) {
		    	 SavingAccount savingAccount = new SavingAccount("Rohan","13A Najafgarh",3289.89,"16-01-2021","Active");
		     }else {
		    	 CurrentAccount currentAccount = new CurrentAccount("Rohan","13A Najafgarh",3289.89,"16-01-2021","Active");
		     }
		     break;
		 case 2: 
			 System.out.println("Please enter the amount to be withdrawn");
		 	 double withdrawlAmount = scanner.nextDouble();
		 	 break;
		 case 3: 
			 System.out.println("Please enter the amount to be deposited");
		 	 double depositAmount = scanner.nextDouble();
		 	 break;
		 case 4:
			 break;
		 default:
			 System.out.println("Sorry! wrong choice");
		}	       
	}
}
