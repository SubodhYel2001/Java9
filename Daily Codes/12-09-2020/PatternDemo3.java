
class PatternDemo3 {

	public static void main(String[] args){
		
		char ch = 'A';
		for(int i = 4; i >= 1; i--){
		
			for(int j = 1; j <= i; j++){

				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
			
		}
	}
}
