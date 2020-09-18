import java.io.*;

class QuotientReminder {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("\nEnter Dividend = ");
		int num1 = Integer.parseInt(br.readLine());

		
		System.out.print("\nEnter Divisor = ");
		int num2 = Integer.parseInt(br.readLine());

		float que, rem;

		que = num1/ num2;

		rem = num1 % num2;

		System.out.println("\nQuotient = "+que);

		System.out.println("\nReminder = "+rem);


	}
}
