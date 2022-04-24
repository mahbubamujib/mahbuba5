package com.mahbuba;

public class Stringbuffer {
public static void main(String[] args) {
	String xyz="radam";
	StringBuffer abc=new StringBuffer(xyz);
	abc.reverse();
	String def=abc.toString();
	if(xyz.equalsIgnoreCase(def)){
		System.out.println("this is pelindrome: " +xyz);
	}
	else {
		System.out.println("This is not pelindrome: " +xyz);
	}
}
	
	
	
	
}
