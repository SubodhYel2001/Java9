import java.util.Scanner;

class RTO{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("RTO Code :");
		String code = sc.nextLine();
		
		switch(code) {
			
			case "MH" :
			
					System.out.println("State name : Maharashtra");
					break;
					
			case "AP" :
			
					System.out.println("State name : Andra Pradesh");
					break;
					
			case "JK" :
			
					System.out.println("State name : Jammu and Kashmir");
					break;
					
			case "TN" :
			
					System.out.println("State name : Tamil Nadu");
					break;
					
			case "UP" :
			
					System.out.println("State name : Uttar Pradesh");
					break;
			
			
			
		}
		
		
	}
	
	
}