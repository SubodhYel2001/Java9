import java.util.Scanner;

class Coding{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Character(P, J, K, B, C) :");
		char character = sc.next().charAt(0);
		//System.out.println("Enter Operator");
		//char op = sc.next().charAt(0);
		switch(character) {
			
			case 'P' :
			
					System.out.println("Language : Python");
					break;
					
			case 'J' :
			
					System.out.println("Language : Java");
					break;
					
			case 'K' :
			
					System.out.println("Language : Kotlin");
					break;
					
			case 'B' :
			
					System.out.println("Language : Bash");
					break;
					
			case 'C' :
			
					System.out.println("Language : C++");
					break;
			
			
			
		}
		
		
	}
	
	
}