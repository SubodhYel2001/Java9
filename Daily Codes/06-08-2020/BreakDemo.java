class BreakDemo {
	
	public static void main(String[] args){
		
		for(int x = 1; x <= 50; x++){
			
			if(x % 5 == 0 && x % 7 == 0)
				break;
				
			else 
				System.out.println(x);
		}
		System.out.println("Out of the loop");
	}
}