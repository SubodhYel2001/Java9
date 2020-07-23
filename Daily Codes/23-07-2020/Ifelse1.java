class IfelseDemo1{
	
	public static void main(String[] args){
	
		int x = 10;
		int y = 11;
		
		if(++x <= --y){                    //if (11 <= 10) ->  false
			
			System.out.println("In if statement");     //x
			System.out.println("X = "+x);              //x
			System.out.println("Y = "+y);              //x
			
		} else {
			
			System.out.println("In else statement");   //print
			System.out.println("X = "+x);              //11
			System.out.println("Y = "+y);              //10
			
		}
		
		System.out.println("Out of if else");
	

	}
			
}