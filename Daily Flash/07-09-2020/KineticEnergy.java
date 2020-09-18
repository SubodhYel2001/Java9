import java.util.Scanner;

class KineticEnergy{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Mass = ");
		double mass = sc.nextDouble();
		
		
		System.out.print("Enter Velocity = ");
		double velocity = sc.nextDouble();

		double kinEnergy;

		kinEnergy = mass*velocity*velocity;
		double x = 0.5*kinEnergy;
		

		System.out.println("Kinetic Energy of that Object is : "+x);
	}

}
