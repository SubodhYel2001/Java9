import java.io.*;

class MaximumNumber3 {
	
	public static void main(String[] args)throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("\nEnter First Number : ");
		int x = Integer.parseInt(br.readLine());
		System.out.print("\nEnter Second Number : ");
		int y = Integer.parseInt(br.readLine());
		System.out.print("\nEnter Second Number : ");
		int z = Integer.parseInt(br.readLine());
		
		if(x > y && x > z){
		
			System.out.println("The Maximum Number amongst "+x+", "+y+" & "+z+" is "+x);
		
		}else if(y > z && y >x){
		
			System.out.println("The Maximum Number amongst "+x+", "+y+" & "+z+" is "+y);
		
		}else{
			
			System.out.println("The Maximum Number amongst "+x+", "+y+" & "+z+" is "+z);
			
		}			
	}
}