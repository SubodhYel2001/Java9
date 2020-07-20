class Bitwise{
	
	
		
	void integer(){	
		int x = 10;
		int y = 20;
		int ans;
		
		System.out.println("::::For int::::");
		System.out.println("\n");
		System.out.println("Bitwise AND(&)");
		
		ans = x & y;
		System.out.println("Ans : "+ans);
		
		System.out.println("Bitwise OR(|)");
		
		ans = x | y;
		System.out.println("Ans : "+ans);
		
		System.out.println("Bitwise XOR(^)");
		
		ans = x ^ y;
		System.out.println("Ans : "+ans);
		System.out.println("\n");
		
	}
	
	
		
	void long_(){	
		int x = 10;
		int y = 20;
		long ans;
		
		System.out.println("::::For long::::");
		System.out.println("\n");
		System.out.println("Bitwise AND(&)");
		
		ans = x & y;
		System.out.println("Ans : "+ans);
		
		System.out.println("Bitwise OR(|)");
		
		ans = x | y;
		System.out.println("Ans : "+ans);
		
		System.out.println("Bitwise XOR(^)");
		
		ans = x ^ y;
		System.out.println("Ans : "+ans);
		System.out.println("\n");
		
	}
	
	
		
	/*void character(){	
		int x = 10;
		int y = 20;
		char ans;
		
		System.out.println("::::For char::::");
		System.out.println("Bitwise AND(&)");
		
		ans = x & y;
		System.out.println("Ans : "+ans);
		
		System.out.println("Bitwise OR(|)");
		
		ans = x | y;
		System.out.println("Ans : "+ans);
		
		System.out.println("Bitwise XOR(^)");
		
		ans = x ^ y;
		System.out.println("Ans : "+ans);
		
	}*/
	
	
		
	void float_(){	
		int x = 10;
		int y = 20;
		float ans;
		
		System.out.println("::::For float::::");
		System.out.println("\n");
		System.out.println("Bitwise AND(&)");
		
		ans = x & y;
		System.out.println("Ans : "+ans);
		
		System.out.println("Bitwise OR(|)");
		
		ans = x | y;
		System.out.println("Ans : "+ans);
		
		System.out.println("Bitwise XOR(^)");
		
		ans = x ^ y;
		System.out.println("Ans : "+ans);
		System.out.println("\n");
		
	}
	
	
		
	void double_(){	
		int x = 10;
		int y = 20;
		double ans;
		
		System.out.println("::::For double::::");
		System.out.println("\n");
		System.out.println("Bitwise AND(&)");
		
		ans = x & y;
		System.out.println("Ans : "+ans);
		
		System.out.println("Bitwise OR(|)");
		
		ans = x | y;
		System.out.println("Ans : "+ans);
		
		System.out.println("Bitwise XOR(^)");
		
		ans = x ^ y;
		System.out.println("Ans : "+ans);
		System.out.println("\n");
		
	}
}

class Main{
	
	public static void main(String[] args){
		
		Bitwise obj1 = new Bitwise();
		obj1.integer();
		obj1.long_();
		//obj1.character();
		obj1.float_();
		obj1.double_();
		
	}
}



/*
Conclusion:

 In the above programe all the data types works properly except char 
 becuase char takes only a single character. 
 After running this program it gives the error
 
 "error: incompatible types: possible lossy conversion from int to char"
 */