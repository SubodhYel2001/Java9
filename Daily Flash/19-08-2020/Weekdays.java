import java.util.Scanner;

class Weekdays {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number between 0 to 6");
		int dayNumber = sc.nextInt();
		
		switch(dayNumber) {
			case 0 :
					System.out.println("Monday");
					break;
					
			case 1 :
					System.out.println("Tuesday");
					break;
					
			case 2 :
					System.out.println("Wednesday");
					break;
					
			case 3 :
					System.out.println("Thrusday");
					break;
					
			case 4 :
					System.out.println("Friday");
					break;
					
			case 5 :
					System.out.println("Saturday");
					break;
					
			case 6 :
					System.out.println("Sunday");
					break;
					
			default :
					System.out.println("You have entered wrong number. \npls Enter number between 0 to 6.");
		}
	}
}