import java.util.*;

class HoursToSecond {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Hours = ");
		int hours = sc.nextInt();

		int sec ;

		sec = 60*60*hours;

		System.out.println(sec+" seconds");	
	}
}
