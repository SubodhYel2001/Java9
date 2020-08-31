class Pattern {
	
	public static void main(String[] args){
		
		for(int x = 1; x <= 5; x++){
			
			if(x % 2 != 0){
				for(int i = 1; i <= x; i++){
					
					System.out.print("0 ");
				
				}
				System.out.println();
			}else{
				
				for(int i = 1; i <= x; i++){
					
					System.out.print("1 ");
					
				}
				System.out.println();
			}
				
		}
	}
}