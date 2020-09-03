class PatternSquare {
	
	public static void main(String[] args){
		
		int x = 1;
		int sq = 1;
		
		for(int i = 1; i <= 4; i++){
			
			for(int j = 1; j <= i; j++){
				
				System.out.print(sq+" ");
				
				x = x+1;
				sq = x*x;
				
			}
			System.out.println();
		}
	}
}