import java.util.Scanner;

class ASCII {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Character : ");
		char character = sc.next().charAt(0);
		
		int x = character;
		
		System.out.println("ASCII Value of "+character+" is "+x);
	}
}