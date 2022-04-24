package com.mahbuba;

import java.util.Scanner;

public class Palindrome {
	public static boolean ispelindrome(String str) {
int a=0,b= str.length()-1;
while(a<b) {
	if(str.charAt(a)!=str.charAt(b))
	return false;
	a++;
	b--;
}
return true;

}
//	public static void main(String[] args) {
//		String cd="madam";
//		cd=cd.toLowerCase();
//		if(ispelindrome(cd))
//		System.out.println("This is pelindrome:  " +cd );
//		else
//			System.out.println(" This is not a pelindrome:"  +cd);
//	}
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Type of your word");
		String abc=xyz.next();
		abc=abc.toLowerCase();
		if(ispelindrome(abc))
		System.out.println("This is pelindrome");
		else
			System.out.println("This is not pelindrome");
	}
}
