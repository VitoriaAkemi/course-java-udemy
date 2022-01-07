package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entites.Employee;
import entites.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i =1 ; i<=n ; i++) {
			System.out.println("Employee #" + i + " data:");
			
			System.out.print("Outsourced (y/n)?" );
			char ch = sc.next().charAt(0);
			
			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if(ch == 'y'){
				System.out.print("Additional charge: ");
				double AdditionalChange = sc.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, AdditionalChange));
			}
			else {
				list.add(new  Employee(name, hours, valuePerHour));
			}
			
		}
		System.out.println();
		System.out.println("PAYMENTS");
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f",emp.payment()));
		}
		
		sc.close();
	}

}
	
