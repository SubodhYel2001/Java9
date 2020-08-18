import java.util.Scanner;

class EvenOdd{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		int rem = 0;
		int add = 0;
		int mul = 1;
		for( ; num != 0;){
			
			rem = num % 10;			
			if(rem % 2==0)
				add = add +rem;
			else 
				mul = mul*rem;
				num = num / 10;			
			
		}
		System.out.println("Addition of Even numbers : "+add);		
		System.out.println("Multiplication of Odd numbers : "+mul);	
	}
}