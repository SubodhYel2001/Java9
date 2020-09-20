/*

		25
		16 25
		9 16 25
		4 9 16 25
		1 4 9 16 25

*/

class SpacePattern3 {
	
	public static void main(String[] args){
		
		int num = 5;
		int a = num;
		
		for(int row = 1; row <= 5; row++){
			
			
			
			for(int col = 1; col <= row ; col++){
				
				int sq = num* num;
				System.out.print(sq+" ");
				num++;
			}
			System.out.println();
			num = a - 1;
			a--;
		}
	}
}