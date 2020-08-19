import java.util.Scanner;

class Days {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for Month");
		int month = sc.nextInt();
		
		switch(month) {
			
			case 1 :
					System.out.println("January is a 30 days month.");
					break;
					
			case 2 :
					System.out.println("February is a 30 days month.");
					break;
					
			case 3 :
					System.out.println("March is a 30 days month.");
					break;
					
			case 4 :
					System.out.println("April is a 30 days month.");
					break;
					
			case 5 :
					System.out.println("May is a 30 days month.");
					break;
					
			case 6 :
					System.out.println("June is a 30 days month.");
					break;
					
			case 7 :
					System.out.println("July is a 30 days month.");
					break;
					
			case 8 :
					System.out.println("August is a 30 days month.");
					break;
					
			case 9 :
					System.out.println("September is a 30 days month.");
					break;
					
			case 10 :
					System.out.println("October is a 30 days month.");
					break;
					
			case 11:
					System.out.println("November is a 30 days month.");
					break;
					
			case 12:
					System.out.println("December is a 30 days month.");
					break;
					
			default :
					System.out.println("You have entered wrong number. \npls Enter number between 0 to 12.");
		}
	}
}