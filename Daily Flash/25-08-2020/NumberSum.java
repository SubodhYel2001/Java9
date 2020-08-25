import java.io.*;

class NumberSum {
	
	public static void main(String[] args) throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Enter Number : ");
		int num = Integer.parseInt(br.readLine());
		int sum =0;
		for(int i = 1; i <= 10; i++){
			
			sum = sum + i;
			
		}
		System.out.print("\nThe sum number up to 10 : "+sum);
	}
}