package com.capgemini.assements.second;

import java.util.Scanner;

public class Information {

	private static Scanner scn;

	public static void main(String[] args) {

		String yesno;
		String name = null;
		byte age = 0;
		String address = null;
		long contactno = 0l;
		String email = null;
		scn = new Scanner(System.in);
		do {
			System.out.println("1.Name\n2.Age\n3.Address\n4.Contact number\n5.Email\n6.Exit");
			System.out.println("Enter your choice : ");
			int choice = scn.nextInt();

			switch (choice) {
			case 1:
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter name :");
				name = sc.nextLine();
				break;

			case 2:
				System.out.println("Enter age :");
				age = scn.nextByte();
				break;

			case 3:
				System.out.println("Enter Address :");
				address = scn.nextLine();
				break;

			case 4:
				System.out.println("Enter contact no :");
				contactno = scn.nextLong();
				break;

			case 5:
				System.out.println("Enter email :");
				email = scn.nextLine();
				break;

			case 6:
				System.exit(0);

			default:
				System.out.println("enter valid input");
				break;
			}
			System.out.println("Do you want to continue ?");
			yesno = scn.next();
		} while (yesno.equals("yes"));

		if (name != null) {
			System.out.println("Name:" + name);
		}
		if (age != 0) {
			System.out.println("Age:" + age);
		}
		if (address != null) {
			System.out.println("Address:" + address);
		}
		if (contactno != 0l) {
			System.out.println("Contact number:" + contactno);
		}
		if (email != null) {
			System.out.println("Email:" + email);
		}
	}
}
