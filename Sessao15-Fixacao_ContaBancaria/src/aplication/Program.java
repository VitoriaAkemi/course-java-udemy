package aplication;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.AmountExceedsException;
import model.exceptions.NotEnoughBalanceException;

public class Program {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	
		try {
		System.out.println("Enter account data");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		
		System.out.print("Holder: ");
		String holder = sc.next();
		
		System.out.print("Initial balance: ");
		Double balance = sc.nextDouble();
		
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		Account ac = new Account(number, holder, balance, withdrawLimit);
		
		System.out.print("Enter amount for withdraw: ");
		Double amount = sc.nextDouble();
		
		ac.withdraw(amount);
		
		System.out.print("New balance: " + String.format("%.2f", ac.getBalance()));
		}
		catch (AmountExceedsException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch (NotEnoughBalanceException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		sc.close();
	}

}
