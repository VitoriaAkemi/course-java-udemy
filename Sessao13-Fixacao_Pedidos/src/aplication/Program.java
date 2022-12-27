package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entites.Client;
import entites.Order;
import entites.OrderItem;
import entites.Product;
import entites.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("Birth date (DD/MM/YYYY):");
		Date birthDate = sdf.parse(sc.nextLine());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(birthDate, status, client);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		for(int i =1 ; i<=n ; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String productName = sc.next();
			
			System.out.print("Product price:");
			double productPrice = sc.nextDouble();
			
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(quantity, productPrice, new Product(productName, productPrice));
			order.addItem(orderItem);
		
		}
		
		System.out.println("ORDER SUMMARY:");
		System.out.print(order);
		

		sc.close();

	}

}
