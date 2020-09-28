import java.util.*;

class ScannerClass {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("String1 : ");
		String name = sc.next();
		
		System.out.print("String2 : ");
		String lastName = sc.next();
		
		
		System.out.println("\n\nResult : "+name+" "+lastName);
	}
}