package com.mahbuba;

import java.util.Scanner;

public class Checkprimenumber1 {
public static void main(String[] args) {
	Scanner ab=new Scanner(System.in);
	System.out.println("Enter the positive number: ");
		int a=ab.nextInt();
	int count=0;
	if(a>1) {
		for(int i=1;i<=a;i++){
			if(a%i==0) 
				count++;
			
				
		}
				 
	}
		if(count==2) {
			System.out.println("prime number");
		}	
		else {
		System.out.println("Not prime number");	
			}	
		}
}
