class Capgemini{
	
	static int noOfEmp = 200000;
		   int projectCount = 200;
	
	void displayProject(){
		
		System.out.println("Capgemini Project Count : "+projectCount);
		
	}
	static void noOfEmp(){

		System.out.println("Capgemini Total Emp : "+noOfEmp);
		
	}
	
	
}

class TCS{
	
	static int noOfEmp = 300000;
		   int projectCount = 300;
	
	void displayProject(){
		
		System.out.println("TCS Project Count : "+projectCount);
		
	}
	static void noOfEmp(){

		System.out.println("TCS Total Emp : "+noOfEmp);
		
	}
	
}

class ITCompanies{
	
	public static void main(String[] args){
	
    
	System.out.println("Capgemini");
	Capgemini pune = new Capgemini();
	pune.projectCount= 130;
	pune.displayProject();
	pune.noOfEmp();
	
	System.out.println("Capgemini");
	Capgemini chennai = new Capgemini();
	chennai.projectCount= 70;
	chennai.displayProject();
	chennai.noOfEmp();
	
	System.out.println("TCS");
	TCS mumbai = new TCS();
	mumbai.projectCount= 200;
	mumbai.displayProject();
	Pune.noOfEmp();
	
	System.out.println("TCS");
	TCS banglore = new TCS();
	banglore.projectCount= 100;
	banglore.displayProject();
	bangloree.noOfEmp();
	
	
	
	
	}
		
		
}
	


