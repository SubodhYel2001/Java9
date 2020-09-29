

class Array2 {
	
	public static void main(String[] args){
		
		int[] num = new int[5];
		
		num[0] = 45;
		num[1] = 4;
		num[2] = 52;
		num[3] = 12;
		num[4] = 88;
		
		
		System.out.print("\nArray = ");
		for(int j = 0; j < 5; j++){
			
			System.out.print(num[j]+"  ");
			
		}
		
		System.out.print("\n\nEven Number = ");
		for(int i = 0; i < 5; i++){
			
			if(num[i] % 2 == 0){
				
				System.out.print(num[i]+"  ");
			}
		}
	}
}