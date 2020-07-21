class Program2{

	int num1;
	int num2;
	
	int ans;

	void add(){
	
	ans = num1 + num2;
		System.out.println("Addition =       " +ans);
	}
	void sub(){
	
	ans = num1 - num2;
		System.out.println("Subtraction =    " +ans);
	}
	void mul(){
	
	ans = num1 * num2;
		System.out.println("Multiplication = " +ans);
	}
	void div(){
	
	ans = num1 / num2;
		System.out.println("Division =       " +ans);
	}
	void mod(){
	
	ans = num1 % num2;
		System.out.println("Modulas =        " +ans);
	}

	public static void main(String[] args){
	
		Program2 obj = new Program2();
		obj.num1 = 20;
		obj.num2 = 10;
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
		obj.mod();

	}
}
