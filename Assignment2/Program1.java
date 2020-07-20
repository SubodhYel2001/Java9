class Relational1{
	
	public static void main(String[] args){
		
		int x = 20;
		int y = 50;
		boolean ans;
		
		ans = x < y;		//less than
		System.out.println(":::<:::");
		System.out.println("Ans : "+ans);
		
		ans = x > y;							//greater than
		System.out.println(":::>:::");
		System.out.println("Ans : "+ans);
		
		ans = x <= y;							//less than or equal to
		System.out.println(":::<=:::");
		System.out.println("Ans : "+ans);
		
		ans = x >= y;							//greater than or equal to
		System.out.println(":::>=:::");
		System.out.println("Ans : "+ans);
		
		ans = x == y;							//equivalent
		System.out.println(":::==:::");
		System.out.println("Ans : "+ans);
		
		ans = x != y;							//not equivalent
		System.out.println(":::!=:::");
		System.out.println("Ans : "+ans);
	}
	
	
}