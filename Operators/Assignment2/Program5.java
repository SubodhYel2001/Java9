class Pune{
	
	static int covidActiveCases = 13062 ;
	int totalCases = 35878 ;
	
	static void noCorona(){
		
		System.out.println("CORONA Free Pune");
		
		
	}
	
	void lockdown(){
		
		System.out.println("\nLockdown: ");
		covidActiveCases++;
		totalCases++;
		System.out.println("COVID Active Cases : " +covidActiveCases);
		System.out.println("Total Cases : " +totalCases);
		
	}
	
	void noLockdown(){
		
		System.out.println("\nNo Lockdown: ");
		covidActiveCases++;
		totalCases++;
		System.out.println("COVID Active Cases : " +covidActiveCases);
		System.out.println("Total Cases : " +totalCases);
		
		
	}
}

class Mumbai{
	
	static int covidActiveCases = 23917;
	int totalCases = 100350;
	
	static void noCorona(){
		
		
		System.out.println("CORONA Free Mumbai");
		
	}
	
	void lockdown(){
		
		
		System.out.println("\nLockdown: ");
		covidActiveCases++;
		totalCases++;
		System.out.println("COVID Active Cases : " +covidActiveCases);
		System.out.println("Total Cases : " +totalCases);
		
	}
	
	void noLockdown(){
		
	
		System.out.println("\nNo Lockdown: ");
		covidActiveCases++;
		totalCases++;
		System.out.println("COVID Active Cases : " +covidActiveCases);
		System.out.println("Total Cases : " +totalCases);
		
	}
	public static void main(String[] args){
		
		System.out.println("\nPUNE : \n");
		Pune p1 = new Pune();
		p1.noCorona();
		p1.lockdown();
		p1.noLockdown();
		
		Pune p2 = new Pune();
		p2.lockdown();
		p2.noLockdown();
		
		System.out.println("\nPUNMUMBAI : \n");
		Mumbai m1 = new Mumbai();
		m1.noCorona();
		m1.lockdown();
		m1.noLockdown();
		
		Mumbai m2 = new Mumbai();
		m2.lockdown();
		m2.noLockdown();
		
	}
}