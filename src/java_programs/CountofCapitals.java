package java_programs;

public class CountofCapitals {

	public static void main(String[] args) {
		
		
		String s = "WelComE";
		
		char ch[] = s.toCharArray();
		
		for(int i =0; i<ch.length; i++){
			
//			if(ch[i] >= 65 && ch[i] <=90)
				
			if (ch[i] >= 'A' && ch[i] <= 'Z')
			
			{
				System.out.println("The Upper letters in string are" + ch[i]);
			}
			
			else if(ch[i]>'a' && ch[i]<'z')
			{
				
				System.out.println("The Lower letters in string are "+ ch[i]);
			}
			
			else if(ch[i]>'0' && ch[i]<'9')
			{
				
				System.out.println("The given letters in string are  "+ ch[i]);
			}
			
			else{
				
				System.out.println("The given special letters in string are  "+ ch[i]);
				
			}
		}

	}
	
	
	
	
	
	
	
	
	

}
