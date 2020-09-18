import java.util.*;

class ComplexNumber {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("\nEnter Number 1 :");

		System.out.print("Real Part :");
		int num1 = sc.nextInt();


		System.out.print("Imaginary Part :");
		int num2 = sc.nextInt();

		System.out.println("\nEnter Number 2 :");

		System.out.print("Real Part :");
		int num3 = sc.nextInt();


		System.out.print("Imaginary Part :");
		int num4 = sc.nextInt();

		int sum1, sum2;

		sum1 = num1 + num3;
	        sum2 = num2 + num4;

		System.out.println("\nThe Addition of "+num1+"+"+num2+"i & "+num3+"+"+num4+"i is "+sum1+"+"+sum2+"i.");	


	}


}
