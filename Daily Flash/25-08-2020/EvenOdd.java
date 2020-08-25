import java.io.*;

class EvenOdd {
	
	public static void main(String[] args)throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter Number : ");
		int num = Integer.parseInt(br.readLine());
		
		if(num % 2 == 0){
			
			System.out.println("\n"+num+" is an Even Number.");
			
		}else{
			
			System.out.println("\n"+num+" is an Odd Number.");
			
		}
	}
}