/*

		1
		1 0
		1 0 1
		1 0 1 0
		1 0 1 0 1

*/


class SpacePatternABC3 {

	public static void main(String[] args){
		
		int num = 1;
		int x = num;	
		for(int row = 1; row <= 5; row++){

			for(int col = 1; col <= row; col++){
					
				System.out.print(num+" ");
					
				if(num == 1)
					num--;
				else
					num++;			

			}
			System.out.println();
			num = x;
		}
	}
}
