import java.io.*;

class SwapNumber {

	public static void main(String[] args) throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("\na = ");
		int a = Integer.parseInt(br.readLine());
	
		
		System.out.print("\nb = ");
		int b = Integer.parseInt(br.readLine());

		System.out.println("\na = "+b+"b = "+a);

	}
}
