import java.io.*;

class SumAndAverage {
	
	public static void main(String[] args)throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("\nEnter Number : ");
		double num = Double.parseDouble(br.readLine());
		double sum = 0;
		double avg = 0;
		for(int i = 1; i <= num; i++){
			
			sum = sum + i;
			
		}
		avg = sum / num;
		System.out.println("\nSum of "+num+" entered Number is:"+sum);
		System.out.println("\nAverage of "+num+" entered Number is:"+avg);
	}
}