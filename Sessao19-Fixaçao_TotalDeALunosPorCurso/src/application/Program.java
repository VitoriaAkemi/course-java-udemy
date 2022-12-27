package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.User;



public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<User> set = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int code = sc.nextInt();
			set.add(new User(code));
		}
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int code = sc.nextInt();
			set.add(new User(code));
		}
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int code = sc.nextInt();
			set.add(new User(code));
		}
		System.out.println("Total students: " + set.size());

		sc.close();
	}

}
