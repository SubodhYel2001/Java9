import java.io.*; 

class Input1 {
	
	public static void main(String[] args)throws IOException{
		
		int sq = 0, cube = 0;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Enter First Number : ");
		int num1 = Integer.parseInt(br.readLine());
		
		System.out.print("Enter Last Number : ");
		int num2 = Integer.parseInt(br.readLine());
		
		System.out.print("\nOutput : ");
		for(int i = num1; i <= num2; i++){
			
			if(i % 2 == 0){
				
				sq = i*i;
				System.out.print(sq+" ");
			}else{
				
				cube = i*i*i;
				System.out.print(cube+" ");
				
			}
		}
		System.out.print("\n");
	}
}