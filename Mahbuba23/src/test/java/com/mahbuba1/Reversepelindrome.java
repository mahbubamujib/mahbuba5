package com.mahbuba1;

public class Reversepelindrome {
public static void main(String[] args) {
	String abc="radar";
	System.out.println("Enter the String name   "  +abc);		
	
	String count="";
	for(int i=abc.length()-1; i>=0;i--) {
		count=count+abc.charAt(i);
		
	}
     if (abc.equalsIgnoreCase(count))
    	 System.out.println( abc +   "  This is pelindrome"); 
     else
    	 System.out.println(abc +   "  This is not pelindrome");
}
}
