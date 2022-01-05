package java_programs;
import org.apache.commons.lang3.RandomStringUtils;

public class Random_String {

	public static void main(String[] args) {


		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		
		System.out.println("The random strings are " + generatedstring);
		
		String randomnumbers =RandomStringUtils.randomNumeric(4);
		
		System.out.println("The random strings are " + randomnumbers);
	}

}
