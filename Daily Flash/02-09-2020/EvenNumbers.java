import java.io.*;

class EvenNumbers {
	
	public static void main(String[] args) throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("\nMinimum of Series : ");
		int x = Integer.parseInt(br.readLine());
		System.out.print("\nMaximum of Series : ");
		int y = Integer.parseInt(br.readLine());
		
		System.out.print("\nSeries Of Odd Numbers Ranging between "+x+" & "+y+" is :");
		
		for(int i = x; i <= y; i++){
			
			if (i % 2 == 0)
				System.out.print(i);
			else
				System.out.print(" ");
		}
		System.out.print("\n");
	}
}