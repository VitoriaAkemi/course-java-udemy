package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entites.ImportedProduct;
import entites.Product;
import entites.UsedProduct;


public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i =1 ; i<=n ; i++) {
			System.out.println("Product #" + i + " data:");
			
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			
			if(ch == 'i'){
				System.out.print("Customs fee: ");
				Double customFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customFee));
			}
			else if(ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY):");
				Date date = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, date));
			}
			else {
				list.add(new Product(name, price));
			}
			
		
		}
		System.out.println("PRICE TAGS: ");
		for (Product pro : list) {
			System.out.println(pro.priceTag());
		}
		sc.close();
		
	}

}
