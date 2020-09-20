import java.io.*; 

class Input2 {
	
	public static void main(String[] args)throws IOException{
		
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Enter Difference : ");
		int num1 = Integer.parseInt(br.readLine());
		
		
		System.out.print("\nOutput : ");
		for(int i = 1; i <= 50;){
			
			System.out.print(i+" ");
			i = i + num1;
		}
		System.out.print("\n");
	}
}