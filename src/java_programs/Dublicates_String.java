package java_programs;

import java.util.HashSet;

@SuppressWarnings("unused")
public class Dublicates_String {

	public static void main(String[] args) {
		
		String arr[]={"Java", "C", "C++", "Python", "Java"};
		
		boolean flag = false;
		
		
		for(int i =0 ; i<arr.length; i++){
			
			for(int j=i+1; j<arr.length;j++){
				
				if(arr[i]==arr[j]){
					
					System.out.println("The Dublicate Value is " + arr[i]);
					flag = true;
				}
				
				else{
					
					flag = false;
				}
					
				
			}
			
			
		}
		
//		HashSet <String> s = new HashSet<String>();
//		
//		boolean flag = false;
//		
//		for(String l:arr){
//			
//			if(s.add(l)==false){
//				
//				System.out.println("Found Dublicate Element " + l);
//				
//				flag = true;
//				
//			}
//			
//			else{
//				
//				
//				flag = false;
//			}
//			
//		}
//		
		
		
		
		 
		
	}

}
