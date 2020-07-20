class Compliment{
	
	
		
	void integer(){	
		int x = 10;
		
		System.out.println("::::For Integer::::");
		
		 
		System.out.println("Ans : "+~x);
		
	}
	
	void long_(){	
		int x = 10;
		
		System.out.println("::::For Long::::");
		
		 
		System.out.println("Ans : "+~x);
		
	}
	
	void float_(){	
		int x = 10;
		
		System.out.println("::::For Float::::");
		
		 
		System.out.println("Ans : "+~x);
		
	}
	
	void double_(){	
		int x = 10;
		
		System.out.println("::::For Double::::");
		
		 
		System.out.println("Ans : "+~x);
		
	}
	
	void character(){	
		int x = 10;
		
		System.out.println("::::For Character::::");
		
		 
		System.out.println("Ans : "+~x);
		
	}
	
}

class Program4{
	
	public static void main(String[] args){
		
		Compliment obj1 = new Compliment();
		obj1.integer();
		obj1.long_();
		obj1.float_();
		obj1.double_();
		obj1.character();
	}
}
