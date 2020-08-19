class CheckChar {
	
	public static void main(String[] args){
		
		char x = 'v';
		int y = x;
		
		if(65<= y && y <=90){
			
			System.out.println("Letter "+x+" is in Upper Case");
			
		}else if(97<= y && y <=122){
			
			System.out.println("Letter "+x+" is in Lower Case");
		}
	}		
}