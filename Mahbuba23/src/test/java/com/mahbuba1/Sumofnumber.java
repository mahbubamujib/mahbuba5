package com.mahbuba1;

public class Sumofnumber {


public static void main(String[] args) {
	int [] a= {10,2,5,4,6,3,8,7,9,1};
	int sum=10;
	for(int i=0;i<a.length;i++) {
		      for(int j=i+1; j<a.length;j++) {
		    for( int k=i+i+1;k<a.length;k++) {
		    	
		     
		if(a[i] + a[j] + a[k]==sum) {
			System.out.println(a[i]+","+a[j]+","+a[k]);
		System.out.println("this is sum  " +sum);
		}	
		
	}
}






}	

}
}