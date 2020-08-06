import java.util.Scanner;

class Scholarship{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Student year : ");
		int year = sc.nextInt();
		
		switch(year) {
			
			case 1 :
					System.out.println("First year Student are not Eligible");
					break;
			
			case 2 :
					System.out.println("Second year Student are not Eligible");
					break;
			
			case 3 :
			{
				System.out.println("Student marks : ");
				int marks = sc.nextInt();
				
				switch(marks) {
					
					case 40:
										System.out.println("Student not elligible for Education scholarship");
										break;
 
					case 60:
                                         System.out.println("Student not elligible for Education scholarship");
                                         break;
                                           
			         case 70:
                                         System.out.println("Student not elligible for Education scholarship");
                                         break;

			         case 80:
                                         System.out.println("Student  elligible for Education scholarship"); 
					
					 					 
                                         break;// break and out of switch

			         case 100:
                                         System.out.println("Student  elligible for Education scholarship");
                                         break; 
					
					
				}
				
				
				
			}
					
			
		}
		
	}
	
}