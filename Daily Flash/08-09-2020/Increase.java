import java.util.*;

class Increase {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number : ");
		int num1 = sc.nextInt();

		for(int i = 1;i <= 100;){

			System.out.print(i+" ");

			i = i + num1;
		}

		System.out.println();
	}
}
