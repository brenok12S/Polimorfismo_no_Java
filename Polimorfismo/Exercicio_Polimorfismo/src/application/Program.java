package application;


import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employee: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1) + " data: ");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name : ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours : ");
			int hours = sc.nextInt();
			System.out.print("Value per hour : ");
			double valuePerHour = sc.nextDouble();
			
			if (ch == 'y') {
				System.out.print("Additional charge : ");
				double additionalCharge = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp);
			} else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}
			
			
			
		}
		
		System.out.println();
		System.out.println("PAYMENTS : ");
		
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $" + String.format("%.2f",emp.payment()));
			
		}
		
		
		sc.close();

	}

}
