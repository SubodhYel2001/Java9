import java.util.Scanner;

class Pythagoras {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Side 1 :");
		int side1 = sc.nextInt();
		
		System.out.print("Enter Side 2 :");
		int side2 = sc.nextInt();
		
		System.out.print("Enter Hypotenuse :");
		int hypotenuse = sc.nextInt();
		
		int x = 0;
		
		x = ((side1*side1) + (side2*side2));
		
		if(hypotenuse == Math.sqrt(x)){
			
			System.out.println("\nTriangle Satisfies the Pythagoras Theorem.");
			
		}else{
			
			System.out.println("\nTriangle not Satisfies the Pythagoras Theorem.");
			
		}
		
	}
}