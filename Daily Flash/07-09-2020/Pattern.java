/*

		7
		6 5
		5 4 3
		4 3 2 1


*/


class Pattern {
	
	public static void main(String[] args){
		
		int x = 7;
		int y = x;
		
		for(int i = 1; i <= 4; i++){
			
			for(int j = 1; j <= i ; j++){
				
				
				System.out.print(x+" ");
				x = x - 1;
			}
			x = y - 1;
			y = y - 1;
			System.out.println();
			
			
		}
		
	}
}