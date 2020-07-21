class Unary2{

	public static void main(String []args){
	
		int a = 10;
		int b = 20;
		int c = 50;
		
		int ans = 0;

		ans = --a + ++b + c--;
		
		System.out.println("Ans = " + ans);	
		System.out.println("a = " + a);	
		System.out.println("b = " + b);	
		System.out.println("c = " + c);	
	}
}