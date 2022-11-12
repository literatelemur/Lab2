import java.util.Scanner;
public class Paycheck {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		
		double hour;
		double payRate;
		double taxRate;
		double other;

		System.out.println("Please enter the following information:");
		System.out.println("Number of hours worked:");
		hour = info.nextDouble();
		System.out.println("Hourly pay rate:");
		payRate = info.nextDouble();
		System.out.println("Federal tax rate (%):");
		taxRate = info.nextDouble() * .01;
		System.out.println("Other deductions:");
		other = info.nextDouble();
		
		System.out.println("Gross pay: " + hour * payRate);
		System.out.println("Deductions: \n \t Federal tax: $" + (hour * payRate) * taxRate);
		System.out.println("\t Other deductions: $" + other);
		System.out.println("\t Total deductions: $" + (other + (hour * payRate) * taxRate));
		System.out.println("Net pay: $" + ((hour * payRate) - (hour * payRate) * taxRate - other));
		
		info.close();
	}

}
