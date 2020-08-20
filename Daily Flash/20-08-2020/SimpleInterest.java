import java.util.Scanner;

class SimpleInterest {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Principal Amount :");
		float principal = sc.nextFloat();
		
		System.out.print("Enter Rate Of Interest :");
		float rateOfInterest = sc.nextFloat();
		
		System.out.print("Enter Time Period :");
		float timePeriod = sc.nextFloat();
		
		float sI = (principal*rateOfInterest*timePeriod)/100;
		
		System.out.println("\nSimple Interest = "+sI);
		
	}
}