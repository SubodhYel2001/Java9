import java.util.Scanner;

class AreaOfCircle {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius : ");
		int radius = sc.nextInt();
		
		double area = 4*3.14*radius*radius;
		
		System.out.println("\nArea Of Circle : "+area);
	}
}