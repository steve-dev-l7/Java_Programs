package com.dev;

public class ApptitudeBased {
	
	public static void main(String[] args) {
		
		
		for(int i=11; i<100; i++) {
			
			if(i%10==0) {
				continue;
			}
			
			int a=i;
			
			int b=0;
			
			final int c=a;
			
			while(a!=0) {
				
				
				
				int tempDigit=a % 10;
				
				b=b*10+tempDigit;
				
				a=a/10;
				
			}
			
			if(c+b==66) {
				int temp=c+b;
				System.out.println(c + " + "+  b+" = "+temp);
			}
			
		}
		
	}
	
	
}
