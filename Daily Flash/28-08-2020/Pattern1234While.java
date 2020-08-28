class Pattern1234While {
	
	public static void main(String[] args){
		
		int sum = 0;
		int i = 1;
		while(i <= 4){
			
			int j = 1;
			while(j <=i){
				
				sum = sum + 1;
				System.out.print(sum+" ");
				j++;
				
			}
			System.out.println();
			i++;
		}
	}
}