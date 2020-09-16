/*

		  A B C D
			A B C
			  A B
				A

*/


class SpacePatternABC1 {

	public static void main(String[] args){
		
		int ch = 'A';
		int x = ch;	
		for(int row = 1; row <= 4; row++){
			for(int space = 0; space < row; space++){

				System.out.print("  ");
			}
			for(int col = 4; col >= row; col--){
					
				System.out.print((char)ch+" ");
				ch++;		
							
			}
			
			System.out.println();
			ch = x;
		}
	}
}
