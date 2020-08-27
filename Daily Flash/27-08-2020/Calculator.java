import java.io.*;

class Calculator {
	
	public static void main(String[] args)throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("\nEnter First Number :");
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("\nEnter Second Number :");
		int num2 = Integer.parseInt(br.readLine());
		System.out.print("\nEnter Operator :");
		char op = (char)br.read();
		
		int add,sub,mul,div,mode;
		
		switch(op) {
			
			case '+' :
					add = num1 + num2;
					System.out.println("\nAddition of "+num1+" & "+num2+" is "+add);
					break;
					
			case '-' :
					sub = num1 - num2;
					System.out.println("\nSubtraction of "+num1+" & "+num2+" is "+sub);
					break;
					
			case '*' :
					mul = num1 * num2;
					System.out.println("\nMultiplication of "+num1+" & "+num2+" is "+mul);
					break;
					
			case '/' :
					div = num1 / num2;
					System.out.println("\nDivision of "+num1+" & "+num2+" is "+div);
					break;
					
			case '%' :
					mode = num1 % num2;
					System.out.println("\nModulus of "+num1+" & "+num2+" is "+mode);
					break;
					
			default :
					System.out.println("\nInvalid Operator");
					
		}
	}
}