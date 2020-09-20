import java.io.*; 

class Input3 {
	
	public static void main(String[] args)throws IOException{
		
		int fact = 1;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Enter First Number : ");
		int num1 = Integer.parseInt(br.readLine());
		
		System.out.print("Enter Last Number : ");
		int num2 = Integer.parseInt(br.readLine());
		
		System.out.println("\nOutput : ");
		
		for(int i =num1; i <= num2; i++){
		
			fact = fact*i;
			System.out.println("Factorial of "+i+":"+fact);
		}
		System.out.print("\n");
	}
}