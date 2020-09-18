
import java.io.*;


class SuccessorPredecessor {

	public static void main(String[] args)throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("\nEnter Number : ");
		int num = Integer.parseInt(br.readLine());

		System.out.println("\nSecond Predecessor : "+(num - 2));
		

		System.out.println("\nSecond Succesor : "+(num + 2));

	}

}
