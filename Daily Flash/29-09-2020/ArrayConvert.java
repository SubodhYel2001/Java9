

class ArrayConvert {
	
	public static void main(String[] args){
		
		char[] cArray = new char[5];
		
		cArray[0] = 'A';
		cArray[1] = 'B';
		cArray[2] = 'C';
		cArray[3] = 'D';
		cArray[4] = 'E';
		
		int lArray = 0;
		
		System.out.print("\nUpper Case = ");
		for(int j = 0; j < 5; j++){
			
			System.out.print(cArray[j]+"  ");
			
		}
		
		System.out.print("\n\nLower Case = ");
		for(int i = 0; i < 5; i++){
			
			lArray = cArray[i] + 32;
			System.out.print((char)lArray+"  ");
		}
	}
}