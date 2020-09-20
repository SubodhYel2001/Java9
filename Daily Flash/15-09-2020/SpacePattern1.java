/*

		        A
			  B C
			C D E
		  D E F G
		E F G H I

*/


class SpacePattern1 {
	
	public static void main(String[] args){
		
		char ch = 'A';
		int a = ch;
		char c = ch;
		int b = c;
		for(int row = 1; row <= 5; row++){
			
			for(int space = 4; space >= row; space--){
				
				System.out.print("  ");
			}
			for(int col = 1; col <= row ; col++){
				
				System.out.print((char)b+" ");
				
				b++;
				
			}
			System.out.println();
			b = a + 1;
			a++;
			
		}
	}
}