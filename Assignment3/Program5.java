class Cricket{
	
	int boundryLength = 0;
	static int pitchLength = 22;
	
	void boundryLength(){
		
		
		System.out.println("\n");
		System.out.println("1) Boundary Length : "+boundryLength+"Yards");
		
	}
	
	static void pitchLength(){
		
	
		System.out.println("\n");
		System.out.println("2) Pitch Length : "+pitchLength+"Yards");
	
		
	}
}
	
	
class Program5{
	public static void main(String[] args){
		
		System.out.println("Largest Cricket Stadium in India:----");
	
		Cricket obj1 = new Cricket();
		obj1.boundryLength= 80;
		obj1.boundryLength();
		obj1.pitchLength();
		System.out.println("\n");
		
		
		System.out.println("Largest Cricket Stadium in World:----");
		
		Cricket obj2 = new Cricket();
		obj1.boundryLength= 90;
		obj1.boundryLength();
		obj1.pitchLength();
	}
}