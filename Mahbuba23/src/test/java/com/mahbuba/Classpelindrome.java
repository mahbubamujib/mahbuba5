package com.mahbuba;

import java.util.Scanner;

public class Classpelindrome {
public static boolean ispelindrome(String str) {
	int a=0,b=str.length()-1;
	while(a<b) {
		if(str.charAt(a) !=str.charAt(b))
			return false;
		a++;
		b--;
	}
	return true;
	
}
public static void main(String[] args) {
	Scanner abc=new Scanner(System.in);
	System.out.println("Type your word");
	
	String xyz=abc.nextLine();
	xyz=xyz.toLowerCase();
	if(ispelindrome(xyz))
		System.out.println("this is pelindrome: " +xyz);
	else
		System.out.println("this is not a pelindrome: " +xyz);
	
}



}
