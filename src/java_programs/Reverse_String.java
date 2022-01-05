package java_programs;

public class Reverse_String {

	public static void main(String[] args) {
	
		String orginal ="mom";
		
		System.out.println("The orginal name is : " + orginal);
		
		String reverse = new StringBuffer(orginal).reverse().toString();
		
		System.out.println("The reverse name is : " + reverse);
		
		if(orginal.equalsIgnoreCase(reverse)){
			
			System.out.println("The given string is palindrome");
		}
		else{
			
			System.out.println("The given string is not palindrome");
		}

			
		
	}

}
