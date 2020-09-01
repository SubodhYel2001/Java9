import java.io.*;

class SwapOrder {
	
	public static void main(String[] args) throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("\nEnter Two Number : ");
		int x = Integer.parseInt(br.readLine());
		System.out.print("\nEnter Second Number : ");
		int y = Integer.parseInt(br.readLine());
		
		System.out.println("Before Swap :"+x+" "+y);
		System.out.println("After Swap :"+y+" "+x);
		
	}
}