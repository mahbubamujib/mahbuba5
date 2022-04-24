package com.mahbuba;

public class EachcharacterString {
public static void main(String[] args) {
	String a="I am Bangladeshi";
	String x=a.toLowerCase();
	int count=0;
	for(int i=0; i<x.length(); i++) {
		if(x.charAt(i)=='a') {
			System.out.println(" ");
			System.out.println(x.charAt(i)+"::" +count);
			System.out.println("Index of value"+" : :" +i);
			count++;
		}
		
	}
	System.out.println(count);
}
}
