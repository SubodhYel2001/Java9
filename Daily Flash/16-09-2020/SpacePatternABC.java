/*

		C
		C G
		C G K
		C G K O
		C G K O S

*/

class SpacePatternABC {

	public static void main(String[] args){
		
		int ch = 'A';
		int x = ch;	
		for(int row = 1; row <= 5; row++){

			for(int col = 1; col <= row; col++){
					
				if(col == 1){

					ch = ch+2;
					
					System.out.print((char)ch+" ");
				}else{
				
					ch = ch+4;

					System.out.print((char)ch+" ");
				}
					
							

			}
			
			System.out.println();
			ch = x;
		}
	}
}
