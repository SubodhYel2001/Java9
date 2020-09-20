import java.io.*;

class ReverseOdd {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Limiting Number : ");
		int num = Integer.parseInt(br.readLine());

		for(int i = (num-1); i >= 1; i--){
			
			if(i % 2 != 0){

				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}
