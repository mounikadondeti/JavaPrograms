package java_programs;

import java.util.Scanner;

@SuppressWarnings("unused")
public class WordsinString {

	public static void main(String[] args) {
	
		String a = "Welcome to Java Programming";
		
		int count = 1;
		
		for(int i =0; i<a.length()-1;i++){
			
			if((a.charAt(i)==' ') && (a.charAt(i+1)!=' ')){
				
				count++;
			}
			
		}
			
		System.out.println("The total words in a given string are " + count);
	}

	

}
