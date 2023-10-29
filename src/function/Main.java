package function;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter bank name ");
		String bname=s.next();
		System.out.println("Enter address of bank");		
		String loc=s.next();
		System.out.println("ifsc_code");
		String ifsc=s.next();
		Bank b =new Bank(bname,loc,ifsc,null);
		
		boolean option =true;
		while(option) 
		{
			System.out.println("Enter your choice");
			System.out.println("Enter 1. for create account");
			System.out.println("Enter 2. for check detalis");
			System.out.println("Enter 3. for deposite money");
			System.out.println("Enter 4. for withdraw money");
			System.out.println("Enter 5. for delete account");
			System.out.println("Enter 6. for exit ");
			
			int choice=s.nextInt();
			switch(choice) {
			case 1: {
				System.out.println("Enter name: ");
				String name=s.next();
				System.out.println("Enter dob: ");
				String dob=s.next();
				System.out.println("Enter pin: ");
				String pin=s.next();
				System.out.println("Enter Deposit amount: ");
				double money=s.nextDouble();
				System.out.println("Enter Account Number: ");
				long ano=s.nextLong();
				b.createAccount(new Account(name, dob, pin, money, ano));
				System.out.println("=================");
				
			}
			break;
			case 2:{
				b.bankDetails();
				System.out.println("=================");	
			}
			break;
			case 3:{
				System.out.println("Enter account number to deposit:");
				long ano1=s.nextLong();
				System.out.println("Enter amount for deposit:");
				double money1=s.nextDouble();
				b.Deposit(ano1, money1);
				System.out.println("=======================");
			}
			break;
			case 4:{
				System.out.println("Enter account number for withdrawl: ");
				long ano1=s.nextLong();
				System.out.println("Enter amount to withdraw: ");
				double money1=s.nextDouble();
				b.withdraw(ano1, money1);
				System.out.println("=======================");
			}
			break;
			case 5:{
				b.DeleteAccount();
				System.out.println("");
			}
			break;
			case 6:{
				System.out.println("Thank you for using "+bname);
			}
			break;
			default:{
				System.out.println("Enter PIN: ");
			}
			break;
		}
	}

	}

}
