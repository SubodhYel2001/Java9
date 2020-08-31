import java.io.*;

class PerfectDivisors {
	
	public static void main(String[] args)throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("\nEnter Number :");
		int num = Integer.parseInt(br.readLine());
		
		System.out.print("Perfect Divisors of "+num+" are : ");
		
		for(int i = 2; i < num; i++){
			
			if((num % i) == 0)
				System.out.print(i+" ");
		}
	}
}