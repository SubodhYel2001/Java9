import java.util.Scanner;

class AdditionOfAngle {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Angle :");
		int angle1 = sc.nextInt();
		System.out.println("Enter Second Angle :");
		int angle2 = sc.nextInt();
		System.out.println("Enter Third Angle :");
		int angle3 = sc.nextInt();
		
		int sum;
		
		sum = angle1 + angle2 + angle3; 
		if (sum == 180){
			
			System.out.println("The triangle with angle "+angle1+", "+angle2+" & "+angle3+" is a valid one.");
			
		}else{
			
			System.out.println("The triangle with angle "+angle1+", "+angle2+" & "+angle3+" is a invalid one.");
			
		}
	}
}