import java.util.Scanner;

class Table {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int x = sc.nextInt();
		int i = 10;
		int ans = x;
		System.out.print("Table of "+x+" in Reverse order is :");
		while(i >= 1){
			
			ans = i*x;
			System.out.print(ans+",");
			i--;
		}
		
	}
}