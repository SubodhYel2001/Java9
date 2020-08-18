class Average {
	
	public static void main(String[] args){
		
		int num = 12345;
		int x = num;
		int rem = 0;
		int sum = 0;
		int ans;
		int add = 0;
		int avg = 0;
		System.out.println(num);
		while(num != 0){
			
			rem = num % 10;  		
			sum = sum + rem;		
			num = num / 10;			
			
			
		}
		for( ; x != 0;){
			
			rem = x % 10;			
			ans = rem / rem;		
			add= add + 1;			 
			x = x / 10;			
			 
		}
		 avg = sum/add;
		System.out.println("Average of digit is : "+avg);
	}
	
	
	
}