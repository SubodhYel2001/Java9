import java.util.Scanner;

class ElectricityBill {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter units = ");
		int units = sc.nextInt();
		
		double bill;
		
		if(units <= 50){
			
			bill = units*0.50;
			System.out.println("\nElectricity Bill = "+bill);
			
		}else if(units <= 150){
			
			bill = units*0.75;
			System.out.println("\nElectricity Bill = "+bill);
			
		}else if(units <= 250){
			
			bill = units*1.20;
			System.out.println("\nElectricity Bill = "+bill);
			
		}else{
			
			bill = units*1.50;
			System.out.println("\nElectricity Bill = "+bill);
			
		}
	}
}