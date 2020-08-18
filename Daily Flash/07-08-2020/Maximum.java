class Maximum{
	
	public static void main(String[] args){
		
		int num = 12357798;
		int rem;
		while(num != 0){
			
			rem = num % 10;
			num = num / 10;
			System.out.println("Num is : "+rem);
			
			
		}
		
	}
}