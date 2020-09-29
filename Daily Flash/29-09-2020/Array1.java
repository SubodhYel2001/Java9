

class Array1 {
	
	public static void main(String[] args){
		
		int[] score = new int[5];
		int sum = 0;
		
		score[0] = 54;
		score[1] = 52;
		score[2] = 3;
		score[3] = 55;
		score[4] = 27;
		
		System.out.print("Individual Score = ");
		for(int i = 0; i < 5; i++){
			
			System.out.print(score[i]+"  ");
			
			sum = sum + score[i];
		}
		System.out.println("\nTotal Score = "+sum);
	}
}