
class PatternDemo2 {

	public static void main(String[] args){
		
		int num = 4;
		for(int i = 4; i >= 1; i--){
		
			for(int j = 1; j <= i; j++){

				System.out.print(num+" ");
			}
			System.out.println();
			num--;
		}
	}
}
