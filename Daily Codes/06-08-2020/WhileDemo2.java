class WhileDemo2 {
	
	public static void main(String[] args){
		
		int num = 136354;
		
		int rem = 0;
		int sum = 0;
		System.out.println(num);
		while(num != 0){
			
			rem = num % 10;  		// rem = 135 % 10 = 5
			sum = sum + rem;		// sum = 0 + 5 = 5
			num = num / 10;			// num = 135 / 10 = 13
			
			
		}
		
		System.out.println("Sum of digit is : "+sum);
	}
	
	
	
}