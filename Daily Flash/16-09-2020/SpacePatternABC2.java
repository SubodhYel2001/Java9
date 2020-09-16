/*

		2
		5 10
		17 26 37
		50 65 82 101

*/


class SpacePatternABC2 {

	public static void main(String[] args){
		
		int num = 1;	
		int x = 1;
		for(int row = 1; row <= 4; row++){

			for(int col = 1; col <= row; col++){
				
				num = num + x;
				System.out.print(num+" ");
				x = x+2;
					
					
			}
			
			System.out.println();
			
		}
	}
}
