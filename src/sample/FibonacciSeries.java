package sample;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a=0,b=0,c=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		int  input = sc.nextInt();
		for(int i=0;i<input;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(a);
		}
	}
}
