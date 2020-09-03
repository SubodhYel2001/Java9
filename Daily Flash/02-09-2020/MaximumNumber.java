import java.io.*;

class MaximumNumber {
	
	public static void main(String[] args)throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("\nEnter First Number : ");
		int x = Integer.parseInt(br.readLine());
		System.out.print("\nEnter Second Number : ");
		int y = Integer.parseInt(br.readLine());
		
		if(x > y)
			System.out.println("The Maximum Number amongst "+x+" & "+y+" is "+x);
		else
			System.out.println("The Maximum Number amongst "+x+" & "+y+" is "+y);
	}
}