import java.io.*;

class SquareCube {
	
	public static void main(String[] args)throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("\nEnter First Number :");
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("\nEnter Second Number :");
		int num2 = Integer.parseInt(br.readLine());
		
		int sq1,sq2,cu1,cu2,add,sub;
		
		sq1 = num1*num1;
		sq2 = num2*num2;
		cu1 = num1*num1*num1;
		cu2 = num2*num2*num2;
		
		add = cu1 + cu2;
		sub = sq1 - sq2;
		
		
		System.out.println("\nAddition of "+cu1+" & "+cu2+" is "+add);
		System.out.println("\nSubtraction of "+sq2+" & "+sq1+" is "+sub);
		
		
	}
}