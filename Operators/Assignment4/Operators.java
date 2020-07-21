class Arithmetic{
	
	
	void Arithmetic(){
	int x = 10;
	int y = 20;
	
	int ans;
	
	ans = x + y;
	
	System.out.println("Ans : "+ans);
	
	}
}

class Logical{
	
	
	void Logical(){
	int x = 10;
	int y = 20;
	
	boolean ans;
	
	ans = (x++ >= y++) && (--y < ++x);
	
	System.out.println("Ans : "+ans);
	
	}
}

class Bitwise{
	
	
	void Bitwise(){
	int x = 10;
	int y = 20;
	
	int ans;
	
	ans = x & y;
	
	System.out.println("Ans : "+ans);
	
	}
}

class Main{
	
	public static void main(String[] args){
		
		Arithmetic obj1 = new Arithmetic();
		obj1.Arithmetic();
		
		Logical obj2 = new Logical();
		obj2.Logical();
		
		Bitwise obj3 = new Bitwise();
		obj3.Bitwise();
		
	}
	
	
}