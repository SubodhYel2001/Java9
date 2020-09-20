/*
	
	1 2 3 4 5
	3 4 5 6
	5 6 7
	7 8
	9


*/

class SpacePattern5 {
	
	public static void main(String[] args){
		
		int num = 1;
		int x = num;
		for(int row = 1; row <= 5; row++){
			
			for(int col = 5; col >= row ; col--){
				
				System.out.print(num+" ");
				num++;
					
			}
			
			System.out.println();
			x= x+2;
			num = x;
			
			
			
		}
	}
}