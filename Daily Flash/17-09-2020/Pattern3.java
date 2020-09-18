/*

		11111
		22
		33
		44
		55555


*/

class Pattern3 {
	
	public static void main(String[] args){
		
		int num = 1;
		
		for(int row = 1; row <= 5; row++){
			
			for(int col = 1; col <= 5; col++){
				
				if(row == 1 || row == 5){
					System.out.print(num+"");
				
				}else{
					
					if(col == 1 || col == 2){
						System.out.print(num+"");
						
						
					}else{
						
						System.out.print("");
						
					}
						
				}
			}
			System.out.println();
			num++;
			
		}
	}
}