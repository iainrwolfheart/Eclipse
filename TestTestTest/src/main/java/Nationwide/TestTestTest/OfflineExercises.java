package Nationwide.TestTestTest;

import java.util.Arrays;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original,
	// there are two chars.

	// doubleChar("The") → "TThhee"
	// doubleChar("AAbb") → "AAAAbbbb"
	// doubleChar("Hi-There") → "HHii--TThheerree"

	public String doubleChar(String input) {
		String ret="";
		String dblup="";
		int i=0;
		while (i<input.length()) {
				dblup+=(input.substring(i,i+1));
				ret+=dblup;
				ret+=input.substring(i,i+1);
				dblup="";
			}
		i++;
		return ret;
	}
	//
	// A sandwich is two pieces of bread with something in between. Return the
	// string that is between the first and last appearance of "bread" in the
	// given string, or return the empty string "" if there are not two pieces
	// of bread.

	// getSandwich("breadjambread") → "jam"
	// getSandwich("xxbreadjambreadyy") → "jam"
	// getSandwich("xxbreadyy") → ""

	public String getSandwich(String input) {
		String leave="bread";
		String filling="";
		int i=0;
		while (i<input.length()) {
			if (input.substring(i,i+leave.length())==leave);
				i+=((leave.length())-1);
				if (input.substring(i,i+leave.length())==leave){
					filling="";
				}
				else {
					while ((input.substring(i,i+leave.length())!=leave)) {
						filling+=input.substring(i);
					}
				}
			i++;
		}
		return filling;
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false

	public boolean evenlySpaced(int a, int b, int c) {
		int A = a;
		int B = b;
		int C = c;
		
		int[] EvenFlow = {A,B,C};
		Arrays.sort(EvenFlow);
		if ((EvenFlow[1])-(EvenFlow[0])==(EvenFlow[2])-(EvenFlow[1])) {
			return true;
		}
		else {
			return false;
	}}

	// Given a string and an int n, return a string made of the first and last n
	// chars from the string. The string length will be at least n.

	// nTwice("Hello", 2) → "Helo"
	// nTwice("Chocolate", 3) → "Choate"
	// nTwice("Chocolate", 1) → "Ce"

	public String nTwice(String input, int a) {
		int n = a;
		int i = 0;
		String FL = "";
		
		if (n==3){
			FL+=input.substring(i,i+3);
			i=input.length();
			FL+=input.substring(i-3,i);
		}
		else if (n==2){
			FL+=input.substring(i,i+2);
			i=input.length();
			FL+=input.substring(i-2,i);
		}
		else if (n==1){
			FL+=input.substring(i,i+1);
			i=input.length();
			FL+=input.substring(i-1,i);
		}
		return FL;
	}

	// Given a string, return true if it ends in "ly".

	// endsLy("oddly") → true
	// endsLy("y") → false
	// endsLy("oddy") → false

	public boolean endsly(String input) {
		int i = input.length()-1;
		if (input.substring(i-2,i).equals("ly")){
			return true;
		}
		else{
			return false;
		}
	}

	// Given a string, return recursively a "cleaned" string where adjacent
	// chars that are the same have been reduced to a single char. So "yyzzza"
	// yields "yza".

	// stringClean("yyzzza") → "yza"
	// stringClean("abbbcdd") → "abcd"
	// stringClean("Hello") → "Helo"
	public String stringClean(String input) {
		String output="";
		String leave="";
		int i=0;
		int l=output.length();
		while(i<input.length()) {
			if (input.substring(i)==output.substring(l)) {
				leave+=input.substring(i);
			}
			else {
				output+=input.substring(i);
			}
		i++;
		}
		return output;
	}

	// The fibonacci sequence is a famous bit of mathematics, and it happens to
	// have a recursive definition. The first two values in the sequence are 0
	// and 1 (essentially 2 base cases). Each subsequent value is the sum of the
	// previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13,
	// 21 and so on. Define a recursive fibonacci(n) method that returns the nth
	// fibonacci number, with n=0 representing the start of the sequence.

	// fibonacci(0) → 0
	// fibonacci(1) → 1
	// fibonacci(2) → 1

	public int fibonacci(int input) {
		return -1;
	}

	// We have a number of bunnies and each bunny has two big floppy ears. We
	// want to compute the total number of ears across all the bunnies
	// recursively (without loops or multiplication).
	//
	// bunnyEars(0) → 0
	// bunnyEars(1) → 2
	// bunnyEars(2) → 4

	public int bunnyEars(int input) {
		
		return -1;
	}

}
