package string;

import java.util.Scanner;

public class Test {

	public static void main
	(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter your city name:");
		String name = sc.nextLine().toLowerCase().trim(); 
		if(name.equals("hyderabad")) {
			System.out.println("Hello Hyderabadi, Aadab.........");
			}
			else if (name.equals("chennai")) {
			System.out.println("Hello Madrasi, Vanakkam......");
				}
			else if(name.equals("banglore")) {
		System.out.println("Hello Kanadiga, Namaskara........");
		}
	else {
		System.out.println("Please enter a valid city name");
	}
		}
			}
