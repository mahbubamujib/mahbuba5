package com.mahbuba;

public class Sumofnumberpractice {
public static void main(String[] args) {
	int[] a= {3,5,6,7,9,3,12,15,10,4,1};
	int sum=19;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			for(int k=i+i+1;k<a.length;k++) {
				if(a[i]+a[j]+a[k]==sum) {
					System.out.println(a[i]+", "+a[j]+","+a[k]);
					System.out.println("This is sum  "  +sum);
				}
			}
		}
		
	}
}
}
