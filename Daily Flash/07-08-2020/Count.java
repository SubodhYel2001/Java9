import java.util.Scanner;

class Count{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		int rem = 0;
		int ans = 0;
		int sum = 0;
		for( ; num != 0;){
			
			rem = num % 10;			//12345 % 0 = 5
			ans = rem / rem;		//5 / 5 = 1
			sum = sum + 1;			//0 + 1 = 1  
			num = num / 10;			//12345 / 10 = 1234
			
		}
		System.out.println("Count = "+sum);		//5
		
	}
}