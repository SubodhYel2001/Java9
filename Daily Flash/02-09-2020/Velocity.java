import java.io.*;

class Velocity {
	
	public static void main(String[] args) throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("\nEnter Distance : ");
		int d = Integer.parseInt(br.readLine());
		System.out.print("\nEnter Time : ");
		int t = Integer.parseInt(br.readLine());
		
		int velocity=0;
		
		velocity = d / t;
		
		System.out.println("The Velocity of a Partical Roaming in a Space is : "+velocity+" m/s");
	}
}