import java.io.*;

class SquareCube {
	
	public static void main(String[] args)throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("\nEnter Range's last Number :");
		int num = Integer.parseInt(br.readLine());
		int squ = 0,cube = 0;
		
		for(int i = 1; i <= num; i++){
			
			if(i % 2 != 0){
				squ = i*i;
				cube = i*i*i;
				
				System.out.println("\nCube of "+i+" : "+cube+" and Square of "+i+" is : "+squ);
			}
			
		}
	}		
}