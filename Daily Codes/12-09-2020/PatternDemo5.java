/*
 
 	1 A 3 B
 	5 C 7
 	8 D  
 	10
 
 
 
 */

class PatternDemo5 {

	public static void main(String[] args){
		
		int num = 1;
		char ch = 'A';
		for(int i = 4; i >= 1; i--){
				
			for(int j = 1; j <= i; j++){
				
				if(j == 1 || j == 3){
					System.out.print(num+" ");
					num++;
					
					
				}else{
					System.out.print(ch+" ");
					num++;
					ch++;
				}
			}
			System.out.println();
			
			
		}
	}
}
