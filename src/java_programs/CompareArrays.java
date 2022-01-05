package java_programs;

import java.util.Arrays;

@SuppressWarnings("unused")
public class CompareArrays {

	public static void main(String[] args) {
		
		int a1[] = {1,2,3,4};
		
		int a2[] = {1,2,3,4};
		
//		System.out.println(Arrays.equals(a1, a2));
		
		for (int i = 0; i<a1.length; i++){
			
			for(int j =0; j<a2.length; j++){
				
				if(a1[i] == a2[j]){
					
					System.out.println("The given arrays are equal");
					break;
				}
				
				else{
					
					System.out.println("The given arrays are not equal");
				}
				
			}
			
		}
		       
	
	}

}
