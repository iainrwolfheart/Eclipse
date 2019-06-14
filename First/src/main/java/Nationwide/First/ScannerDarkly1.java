package Nationwide.First;

import java.util.Scanner;

public class ScannerDarkly1 {

	public static void main(String[] args) {
		
		Scanner ref=new Scanner(System.in);
		System.out.println("What is your name?");
		String name=ref.nextLine();
		System.out.println("Hello "+name);
		
		System.out.println("How much is a Fanta? £");
		float price=ref.nextFloat();
		
		System.out.println("How many did you buy? ");
		int quan=ref.nextInt();
		
		float result=quan*price;
		System.out.println("Your total comes to £"+result);
	}

}
