package sample;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		//String s = "abc";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String input = sc.nextLine();
		char[] ch = input.toCharArray();
//		int count =0;
//		for(int i=0; i< ch.length/2; i++) {
//		if(ch[i] == ch[ ch.length-1-i]){
//
//		count++;
//
//		}else{
//		count =0;
//		System.out.println("not palindrome");
//		}
//		}
//
//		if(count >0) {
//		System.out.println(" palindrome");
//		}
		String reverse = "";
		
		for ( int i = input.length() - 1; i >= 0; i-- )  
	         reverse = reverse + input.charAt(i);  
	      if (input.equals(reverse))  
	         System.out.println("Entered string/number is a palindrome.");  
	      else  
	         System.out.println("Entered string/number isn't a palindrome.");   
	   }  

		}


