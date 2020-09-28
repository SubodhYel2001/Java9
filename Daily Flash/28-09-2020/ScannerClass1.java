import java.util.*;

class ScannerClass1 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string ID : ");
		String string = sc.next();
		
		System.out.print("Enter numerical ID : ");
		int numerical = sc.nextInt();
		
		
		System.out.println("\n\nYour email ID is : "+string+""+numerical+"@gmail.com");
	}
}