/*

		1 2 3 4 5
		2 3 4 5 1
		3 4 5 1 2
		4 5 1 2 3
		5 1 2 3 4


*/

class Pattern2 {
	
	public static void main(String[] args){
		
		int num = 1;
		int x = num;
		
		for(int row = 1; row <= 5; row++){
			int a = 1;
			
			for(int col = 5; col >= row; col--){
				
				System.out.print(num+" ");
				num++;
			}
			for(int space = 1; space <= row -1; space++){
				
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
			num = x + 1;
			x++;
		}
	}
}