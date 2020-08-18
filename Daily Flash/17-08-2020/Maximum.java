class Maximum {
	
	public static void main(String[] args){
		
		int num = 12;
		int rem, sum = 0;
		
		
		rem = num % 10;
		num = num / 10;
		
		if(rem > num){
			System.out.println(rem+" is max number among "+num+" & "+rem);
			
		}else{
			System.out.println(num+" is max number among "+num+" & "+rem);
			
		}
		
	}
}