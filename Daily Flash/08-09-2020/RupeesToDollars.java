import java.util.*;

class RupeesToDollars {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Rupees : ");
		double num1 = sc.nextInt();

		System.out.println("Dollars = "+((int)num1/74));
	}
}
