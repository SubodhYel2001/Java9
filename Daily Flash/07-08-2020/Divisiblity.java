class Divisiblity{
	
	public static void main(String[] args){
		
		int x = 1;
		int n = 0;
		while( x <= 3000){
			
			if(x%7==0 && x%32==0 && x%6==0)
						break;
				for( ; x <= 3000;x++)
					if(x%7==0 && x%32==0)
						
						System.out.println(x);
						if(n > 10)
							break;
				
				
				
				x++;
			
		}
		
		
		/*while( x <= 3000){
			
			
				x++;
		}*/
		
			
		System.out.println(x+" is divisible by 6");
		
	}
}