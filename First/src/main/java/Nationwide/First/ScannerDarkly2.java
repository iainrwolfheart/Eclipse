package Nationwide.First;

import java.util.Scanner;

public class ScannerDarkly2 {

	public static void main(String[] args) {
	
		double total;
		
		Scanner ref= new Scanner(System.in);
		
		System.out.println("How much was your shop?");
		float amount = ref.nextFloat();
		if(amount>=100) {
			total=amount*0.8;
		}
		else {
			total=amount*0.9;
		}
		System.out.println("Final amount = £"+total);
	}

}
