

class Pattern {

	public static void main(String[] args){

		for(int i = 4; i >= 1; i--){
			
			for(int j = 1; j <= i; j++){

				if(i % 2 == 0){
					if(j % 2 == 0)
						System.out.print("= ");
					else
						System.out.print("+ ");
					
				}else{
					if(j % 2 == 0)
						System.out.print("= ");
					else
						System.out.print("+ ");
				}

			}
			System.out.println();

		}

	}
}
