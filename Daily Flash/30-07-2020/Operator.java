import java.util.Scanner;

class Operator {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st No");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd No");
		int num2 = sc.nextInt();
		System.out.println("Enter Operator");
		char op = sc.next().charAt(0);
		
		switch(op) {
			
			case '+' :
					
					System.out.println(num1 + num2);
					break;
					
			case '-' :
					
					System.out.println(num1 - num2);
					break;
			
			case '*' :
					
					System.out.println(num1 * num2);
					break;
					
			case '/' :
					
					System.out.println(num1 / num2);
					break;
					
			case '%' :
					
					System.out.println(num1 % num2);
					break;
			
			default :
			
					System.out.println("Invalid Input");
			
			
			
		}
		
		
	}
	
	
	
}