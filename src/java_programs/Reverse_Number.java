package java_programs;


public class Reverse_Number {

	public static void main(String[] args) {
		
		int rev = 0; int num;
//		
//		Scanner s = new Scanner(System.in);
//		
//		System.out.println(" Enter the number ");
//		
//		num = s.nextInt();
		
		num=1234;
		
		while(num !=0){
			
			rev = rev*10 + num %10;
			
			num = num / 10;
			
		}
		
			System.out.println(rev);
		
		
		
		

	}

}
