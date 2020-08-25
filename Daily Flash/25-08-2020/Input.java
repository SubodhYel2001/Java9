import java.io.*;

class Input {
	
	public static void main(String[] args) throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("");
		
		int num = Integer.parseInt(br.readLine());
		
		System.out.println(num);
		
	}
	
}