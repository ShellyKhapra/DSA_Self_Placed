package com.basic;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the number you want to check");
		int inputNum = sc.nextInt();
		System.out.println(inputNum+" is a "+checkIfNumIsEvenOrOddUsingBitAnd(inputNum)+" number");
		sc.close();
	}
	
	/**
	 * RULE: If AND operation is performed with 1 and given number :- 
	 * And result is 0 (i.e. number&1 == 0) than it means number is even else its odd
	 * @param inputNum the number to test
	 * @return even or odd based on above rule
	 */
	static String checkIfNumIsEvenOrOddUsingBitAnd(int inputNum) {	
		String checkInteger = "";
		if((inputNum&1) == 0) { // number is even
			checkInteger = "even";
		} else {
			checkInteger = "odd";
		}
		return checkInteger;	
	}
}
