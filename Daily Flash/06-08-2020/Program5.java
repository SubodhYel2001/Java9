import java.util.Scanner;

class Table{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int y = sc.nextInt();
		
		System.out.print("Table of 3 is -");
		for(int x =1; x <= y; x++){
			
		
			
			System.out.print(x*3+",");
					
		}
		
		System.out.print("\n\nEven numbers present in table -");
		
		for(int x = 1; x <= y; x++){
		
			if( x%2==0){
				
				System.out.print(x*3+",");
				
		
			}
		}
	}
	
}