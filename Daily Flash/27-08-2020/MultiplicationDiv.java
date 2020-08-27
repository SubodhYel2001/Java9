import java.io.*;

class MultiplicationDiv {
	
	public static void main(String[] args)throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("\nEnter First Number :");
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("\nEnter Second Number :");
		int num2 = Integer.parseInt(br.readLine());
		
		int mul,div1,div2;
		
		mul = num1 *num2;
		
		System.out.println("\nMultiplication is :"+mul);
		
		div1 = num1 / num2;
		div2 = num2 / num1;
		
		if(num1 > num2){
			
			System.out.println("\nDivision is :"+div1);
		}else{
			
			System.out.println("\nDivision is :"+div2);
		}
	}
}