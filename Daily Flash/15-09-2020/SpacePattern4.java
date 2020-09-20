/*

		1 2 3 4 5
		 4 6 8 10
		 9 12 15
		  16 20
		   25

/*

class SpacePattern4 {
	
	public static void main(String[] args){
		
		int num = 1;
		int a = num,sq,d = 1;
		

		for(int row = 1; row <= 5; row++){
			
			
			for(int space = 0; space <= row; space++){
				
				System.out.print(" ");
			}
			for(int col = 5; col >= row ; col--){
				
				System.out.print(num+" ");
				
				num = num+d;		
			}
			d++;
			System.out.println();
			a++;
			sq = a*a;
			num = sq; 
			
			
		}
	}
}