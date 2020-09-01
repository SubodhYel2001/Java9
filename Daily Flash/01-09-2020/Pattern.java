class Pattern {
	
	public static void main(String[] args){
		
		for(int x = 1; x <= 5; x++){
			
			if(x % 2 != 0){
				
				for(int i = 1; i <= x; i++){
					
					System.out.print("A ");
				}
				System.out.println();
			}else{
				
				for(int i = 1; i <= x; i++){
					
					System.out.print("a ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}