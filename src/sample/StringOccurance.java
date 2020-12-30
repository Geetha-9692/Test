package sample;

import java.util.Scanner;

public class StringOccurance {
	public static void main(String[] args) {
		
		//String st = "This is a test program to find occurance";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String input =  sc.nextLine();
		int charCount = 0;
        for(int i =0 ; i<input.length(); i++){
            if(input.charAt(i) == 'a'){
                charCount++;
            }
        }
        System.out.println("count of character 'a' on String: " + charCount);

	}

}
