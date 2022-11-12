import java.util.Scanner;
public class PhoneNumbers {
	
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		
		long fullNumber;
		long areaCode;
		long numberNoArea;
		
		System.out.println("Enter a 10-digit phone number (no spaces or dashes)");
		fullNumber = number.nextLong();
		
		areaCode = fullNumber / 10000000;
		numberNoArea = fullNumber % 10000000;
		
		System.out.println("Area code: " + areaCode);
		System.out.println("Number: " + numberNoArea);
		
		number.close();
	}
	
}
