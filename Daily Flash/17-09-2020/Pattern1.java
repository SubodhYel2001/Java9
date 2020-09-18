/*

		1
		2 1
		3 2 1
		4 3 2 1
		5 4 3 2 1


*/

class Pattern1 {
	
	public static void main(String[] args){
		
		int num = 1;
		int x = num;
		for(int row = 1; row <= 5; row++){
			
			for(int col = 1; col <= row; col++){
				
				System.out.print(num+" ");
				num--;
			}
			System.out.println();
			num = x + 1;
			x++;
		}
	}
}