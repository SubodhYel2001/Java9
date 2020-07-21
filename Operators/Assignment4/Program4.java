class Program4{
	
	public static void main(String[] args){
		
		int a = 25, b = -34, c = 19, d = 4;
		int res = (a << 2 | b >> 3);
		boolean result = ((a << 2 | b >> 3) < -10 ) || ((c++ << 2 & b-- >>> d) >= 23);
		
		System.out.println(res);
		System.out.println(result);
		
		
		
		
	}
	
}


/*
1]. In this line all the numbers are assign to the vaiables such as 
		a = 25, b = -34, c = 19, d = 4;
		
2]. In this line the res is assigning the output of the program or the expression which contain bitwise operator and it operats in int data type such as
		int res = (a << 2 | b >> 3);
		
3]. In this line the another output is assigning the value in boolean because  in the expression logical operator is used and it operats only in boolean value as true or false
	    boolean result = ((a << 2 | b >> 3) < -10 ) || ((c++ << 2 & b-- >>> d) >= 23)
