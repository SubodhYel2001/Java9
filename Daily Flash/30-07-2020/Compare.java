import java.util.Scanner;

class Compare{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		
		if(num == 0) {
			
			System.out.println("Entered Number is equal to zero.");
			
		}else if(num >= 1) {
			
			System.out.println("Entered Number is greater than zero.");
			
		}else{
			
			System.out.println("Entered Number is less than zero.");
			
		}
		
		
	}
	
}