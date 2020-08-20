import java.util.Scanner;

class Persentage {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Physics Marks : ");
		float physics = sc.nextInt();
		
		System.out.print("Enter Chemistry Marks : ");
		float chemistry = sc.nextInt();
		
		System.out.print("Enter Biology Marks : ");
		float biology = sc.nextInt();
		
		System.out.print("Enter Mathematics Marks : ");
		float maths = sc.nextInt();
		
		System.out.print("Enter Computer Marks : ");
		float computer = sc.nextInt();
		
		float totalObtained = physics + chemistry + biology + maths + computer;
		
		float persentage  = (totalObtained/500)*100;
		
		if(persentage >=90){
			
			System.out.println("Persentage ="+persentage+"% : Grade A");
			
		}else if(persentage >=80){
			
			System.out.println("Persentage ="+persentage+"% : Grade B");
			
		}else if(persentage >=70){
			
			System.out.println("Persentage ="+persentage+"% : Grade C");
			
			
		}else if(persentage >=60){
			
			System.out.println("Persentage ="+persentage+"% : Grade D");
			
		}else if(persentage >=40){
			
			System.out.println("Persentage ="+persentage+"% : Grade E");
			
		}else if(persentage < 40){
			
			System.out.println("Persentage ="+persentage+"% : Grade F");
			
		}
	}
}