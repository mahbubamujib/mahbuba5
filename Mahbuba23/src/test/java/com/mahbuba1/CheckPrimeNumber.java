package com.mahbuba1;

public class CheckPrimeNumber {
public static void main(String[] args) {
	int a=29;
	int count=0;
	if(a>1) {
		for(int i=1;i<=a;i++) {
			if(a%i==0) 
				count++;
		}
		if(count==2) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not a Prime number");
		}
		}
	} 
	
}

