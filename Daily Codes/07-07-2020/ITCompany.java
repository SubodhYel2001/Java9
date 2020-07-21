class Capgemini{
	
	static int noOfEmp = 200000;
		   int projectCount = 200;
	
	void displayProject(){
		
		System.out.println("Project Count : "+projectCount);
		
	}
	static void noOfEmp(){

		System.out.println("Total Emp : "+noOfEmp);
		
	}
	
	
}

class TCS{
	
	static int noOfEmp = 300000;
		   int projectCount = 300;
	
	void displayProject(){
		
		System.out.println("Project Count : "+projectCount);
		
	}
	static void noOfEmp(){

		System.out.println("Total Emp : "+noOfEmp);
		
	}
	
}

class ITCompanies{
	
	public static void main(String[] args){
	
    
	System.out.println("Capgemini Pune:-");
	Capgemini pune = new Capgemini();
	pune.projectCount= 130;
	pune.displayProject();
	pune.noOfEmp();
	System.out.println("\n");
	
	System.out.println("Capgemini Chennai:-");
	Capgemini chennai = new Capgemini();
	chennai.projectCount= 70;
	chennai.displayProject();
	chennai.noOfEmp();
	System.out.println("\n");
	
	System.out.println("TCS Mumbai:-");
	TCS mumbai = new TCS();
	mumbai.projectCount= 200;
	mumbai.displayProject();
	mumbai.noOfEmp();
	System.out.println("\n");
	
	System.out.println("TCS Banglore:-");
	TCS banglore = new TCS();
	banglore.projectCount= 100;
	banglore.displayProject();
	banglore.noOfEmp();
	System.out.println("\n");
	
	
	
	
	}
		
		
}
	


