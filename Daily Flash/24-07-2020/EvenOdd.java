class evenOdd{
	
	public static void main(String[] args){
		
		int value = 11;
		int result = evenOdd(value);
		if (result ==1){
			System.out.println("A is even");
		}else {
			
			System.out.println("A is odd");
			
		}
	
		
	}
	
	static int evenOdd(int x){
		
		int a;
		
		if(x % 2 ==0){
			
			return 1;
			
		}else {
			
			return 0;
			
		}
		
	
	}
	
		
}