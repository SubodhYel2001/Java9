class Shifting1 {
	
	
	void one(){
		
		int num = 188;
		int result = 0;
		
		result = num >>> 4;
		
		System.out.println("Ans 1 : "+result);
	}
	
	void two(){
		
		int num = 255;
		int result = 0;
		
		result = num <<< 3;
		
		System.out.println("Ans 2 : "+result);
	}
	
	void three(){
		
		int num = -108;
		int result = 0;
		
		result = num >>> 23;
		
		System.out.println("Ans 3 : "+result);
	}
	
	void four(){
		
		int num = 123;
		int result = 0;
		
		result = num <<< 15;
		
		System.out.println("Ans 4 : "+result);
	}
	
	public static void main(String[] args){
		
		Shifting1 obj = new Shifting1();
		obj.one();
		obj.two();
		obj.three();
		obj.four();
	   
		
		
		
	}
	
	
}