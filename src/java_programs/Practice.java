package java_programs;

public class Practice {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Reverse Number
		
//		int num = 1234;
//		
//		int rev = 0;
//		
//		while(num!=0){
//			
//			rev = rev*10 + num%10;
//			
//			num = num/10;
//			
//		}
//		
//		System.out.println("The reverse number is " + rev);
		
//	Reverse String
//		
//		String a = "Welcome"; String b=""; char c;
//		
//		for(int i =0; i<a.length();i++){
//			
//			c = a.charAt(i);
//			
//			b = c+b;
//			
//		}
//		
//		System.out.println(b);
//		
		
//Dublicates in array
		
		String a[] = {"Java", "Python", "C", "C++", "Java"};
		
		boolean flag = false;
		
		for(int i =0; i<a.length;i++){
			
			for(int j = i+1; j<a.length;j++){
				
				if(a[i]==a[j]){
					
					System.out.println("The dublicate string is " + a[i]);
					
					flag = true;
					
				}
				else{
					
					flag = false;
					
				}
					
			}
		}
		
	}

}
