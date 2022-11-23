package com.selenium;

public class Palindrome_Number {

	public static void main(String[] args) {
		 for (int i = 10; i <500; i++) {

		int r, n = i, ans = 0;
		int temp = n;

		while (n > 0) {
			r = n % 10;
			n = n / 10;
			ans = (ans * 10) + r;
		}
		 

		if (ans == temp) {
			System.out.println("palindrome numbers:"+ans);
		} 
		 }

	}

}
