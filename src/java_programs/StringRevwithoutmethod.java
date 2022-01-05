package java_programs;

public class StringRevwithoutmethod {

	public static void main(String[] args) {
		String a = "Welcome" ;
		String b = "";
		char ch;
		for (int i =0; i<a.length();i++)
		{
			ch = a.charAt(i);
			b = ch+b;
		}
		System.out.println(b);
		
		if(a.equalsIgnoreCase(b)){
			
			System.out.println("The Given String is a Palidram");
			
		}
		
		else{
			
			System.out.println("The Given String is Not a Palidram");
			
			
		}
			
		
			
	}

}
