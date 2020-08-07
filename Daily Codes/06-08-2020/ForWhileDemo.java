class ForWhileDemo {
	
	public static void main(String[] args){
		
		int num = 247;
		int rem = 0;
		int sum = 0;
		System.out.println(num);
		for( ; num != 0; ){
			
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
			
			
		}
		System.out.println("Sum = "+sum);
		
	}
	
}

/*class ForWhileDemo {
	
	public static void main(String[] args){
		
		int sum = 0;
		
		for(int num = 247, rem = 0; num != 0; num = num / 10){
			
			rem = num % 10;
			sum = sum + rem;
			
			
			
		}
		System.out.println("Sum = "+sum);
		
	}
	
}*/