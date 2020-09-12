/*
 
	1 A 2 B
	3 C 4
	5 D
	6

   */
class PatternDemo4 {

	public static void main(String[] args){
		
		int num = 1;
		char ch = 'A';
		for(int i = 4; i >= 1; i--){
				
			for(int j = 1; j <= i; j++){
				
				if(j == 1 || j == 3){
					System.out.print(num+" ");
					num++;
					//ch++;
					
				}else{
					System.out.print(ch+" ");
					//num++;
					ch++;
				}
			}
			System.out.println();
			
			
		}
	}
}
