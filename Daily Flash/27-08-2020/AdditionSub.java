import java.io.*;

class AdditionSub {
	
	public static void main(String[] args)throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("\nEnter num 1 : ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("\nEnter num 2 : ");
		int num2 = Integer.parseInt(br.readLine());
		int add,sub1,sub2;
		
		add = num1 + num2;
		sub1 = num1 - num2;
		sub2 = num2 - num1;
		System.out.println("\nAddition is : "+add);
		
		if(num1 > num2){
			
			System.out.println("\nSubtraction is : "+sub1);
			
		}else{
			
			System.out.println("\nSubtraction is : "+sub2);
		}
		
		
	}
}