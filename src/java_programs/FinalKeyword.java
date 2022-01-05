package java_programs;



public class FinalKeyword {

	public static void main(String[] args) {

		try {
			
			
			System.out.println("This is a try block.........");
			
//			int data = 25/0;
			
			int a[] = new int [5];
			
//			a[6] = 25;
			
			a[1] = 30/0;
			
			
			System.out.println("The value of data is " + a[3]);
		}
		
		catch(ArrayIndexOutOfBoundsException e ){
			
			System.out.println("Exception Handled" + e);
			
			System.out.println(e);
			
		}
		catch (ArithmeticException e){
			
			System.out.println("Exception Handled" + e);
			
		}
		
		catch(Exception e){
			
			System.out.println("This is catch block exception" + e);
		}
		
		
		finally{
			
			System.out.println("This is finally block");
		}
	
		System.out.println("Block of code");
		
	}

}
