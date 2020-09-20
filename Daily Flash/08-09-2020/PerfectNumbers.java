import java.util.*;

class PerfectNumbers {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Limiting Number : ");
		int num1 = sc.nextInt();
		int i ;
		int sum = 0;
		System.out.print("Perfect Numbers between 1 & "+num1+" is ");
		for( i = 1;i <= num1; i++){

			
			for(int j = 1; j <= i-1; j++){
				
				if((i % j) == 0){
					sum = sum + j;
				}
				
			}
			if(sum == i){
				System.out.print(i+", ");
				
			}
			sum =0;
			
		}
		
	}

}


