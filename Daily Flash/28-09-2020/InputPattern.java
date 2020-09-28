import java.util.*;

class InputPattern {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("No of Rows : ");
		int rows = sc.nextInt();
		
		int num = 0;
		for(int row = 1; row <= rows; row++){
			
			for(int col = 1; col <= rows; col++){
				
				System.out.print(num);
				
				if(num == 1)
					num--;
				else
					num++;
				
			}
			System.out.println();
		}
	}
}