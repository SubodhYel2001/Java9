/*

		A B C D E F
		A B C D E
		A B C D
		A B C
		A B
		A
		A
		A B
		A B C
		A B C D
		A B C D E
		A B C D E F


*/

class Pattern5 {
	
	public static void main(String[] args){
		
		
		
		for(int row = 1; row <= 6; row++){
			char ch = 'A';
			
			for(int col = 6; col >= row; col--){
				
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
		
		for(int row = 1; row <= 6; row++){
			char ch2 = 'A';
			
			for(int col = 1; col <= row; col++){
				
				System.out.print(ch2+" ");
				ch2++;
			}
			System.out.println();
		}
	}
}