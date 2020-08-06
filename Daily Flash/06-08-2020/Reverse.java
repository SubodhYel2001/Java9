import java.util.Scanner;

class Reverse{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = sc.nextInt();
		System.out.print("Reverse Order : ");
		
		for(int i = x; i >= 1; i--){
		
			
			System.out.print(i+",");
		
			
		}
		System.out.print("\n\nDivisible by 5 is : ");
		
		for(int i = x; i >= 1; i--){
			
		
		if(i%5==0)
				
				System.out.print(i+",");	
			
			
			
		}
		
	}
	
}