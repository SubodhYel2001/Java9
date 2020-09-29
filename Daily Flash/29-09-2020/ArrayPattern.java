

class ArrayPattern {
	
	public static void main(String[] args){
		
		char[] charArray = new char[5];
		
		charArray[0] = 'A';
		charArray[1] = 'B';
		charArray[2] = 'C';
		charArray[3] = 'D';
		charArray[4] = 'E';
		
		int array = 0;
		int x = array;
		for(int row = 1; row <= 5; row++){
			
			for(int col = 5; col >= row; col--){
				
					System.out.print(charArray[array]+" ");
					array++;
			}
			System.out.println();
			array = x + 1;
			x++;
		}
	}
}