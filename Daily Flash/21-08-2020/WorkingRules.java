import java.util.Scanner;

class WorkingRules {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Age :");
		int age = sc.nextInt();
		System.out.print("Enter Sex :");
		char sex = sc.next().charAt(0);
		System.out.print("Enter Marital Status :");
		char maritalStatus = sc.next().charAt(0);
		
		char female = 'F';
		char male = 'M';
		
		if(sex == female){
			
			System.out.println("She Will work in Urban Area.");
			
		}else if(sex == male && age >= 20 && age < 40){
			
			System.out.println("He May Work in Anywhere.");
			
		}else if(sex == male && age >= 40 && age < 60){
			
			System.out.println("He Will work in Urban Area only.");
			
		}else{
			
			System.out.println("ERROR");
			
		}
	}
}