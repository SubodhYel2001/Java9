class Operators{
	
	int num1 = 50;
	int num2 = 30;
	int ans = 0;
	
	void addition(){
		
		ans = num1 + num2;
		System.out.println("Addition       : "+ans);
		
	}
	
	void subtraction(){
		
		ans = num1 - num2;
		System.out.println("Subtraction    : "+ans);
		
	}
	
	void multiplication(){
		
		ans = num1 * num2;
		System.out.println("Multiplication : "+ans);
		
	}
	
	void division(){
		
		ans = num1 / num2;
		System.out.println("Divison        : "+ans);
		
	}
	
	void modulus(){
		
		ans = num1 % num2;
		System.out.println("Modulus        : "+ans);
		
	}
	
	public static void main(String[] args){
		
		Operators obj1 = new Operators();
		obj1.addition();
		obj1.subtraction();
		obj1.multiplication();
		obj1.division();
		obj1.modulus();
	}
}