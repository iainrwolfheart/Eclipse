package Nationwide.Barren_Moor;

import java.util.Scanner;

public class Barren_Moor {

	public static void main(String[] args) {
		int pns=11;
		int pwe=11;
		
		TransAss NSL = new TransAss();
		NSL.TransporterNS();
		TransAss WEL = new TransAss();
		WEL.TransporterWE();
		
		
		Scanner input = new Scanner(System.in);

		System.out.println("You awake in the middle of a foggy bog with no memory"
				+ "of how you got there. Better find your way to the"
				+ "magic transporter that's definitely there somewhere. Which way will"
				+ "you go? Choose north, south, east or west: ");
		String move = input.nextLine();
		
		if (move="north" || move="south"){
			PlayerMove NS = new PlayerMove();
			NS.NorthSouth(move);
		}
		else if (move="east" || move="west"){
			PlayerMove EW = new PlayerMove();
			EW.EastWest(move);
		}
		else {
			System.out.println("Invalid input, please try again");
		}
	}

}
