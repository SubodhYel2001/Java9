class HondaActiva6g{
	
	static int mileage = 55;
		int salesCount = 150000;
		
		
	static void mileage(){
		
		System.out.println("Mileage : "+mileage+"kmpl");
		
	}
	void salesCount(){

        System.out.println("Sales Count : "+salesCount+"units");

	}		 
	
}

class TVSJupiter{
	
	static int mileage = 62;
		int salesCount = 120000;
		
		
	static void mileage(){
		
		System.out.println("Mileage : "+mileage+"kmpl");
		
	}
	void salesCount(){

        System.out.println("Sales Count : "+salesCount+"units");

	}		 
	
}

class Automobile{
	
	public static void main(String[] args){
		
		System.out.println("<<<<Honda Activa 6g 2019 Info>>>>");
		HondaActiva6g _2019 = new HondaActiva6g();
		_2019.mileage();
		_2019.salesCount=100000;
		_2019.salesCount();
		System.out.println("\n");
		
		System.out.println("<<<<Honda Activa 6g 2020 Info>>>>");
		HondaActiva6g _2020 = new HondaActiva6g();
		_2020.mileage();
		_2020.salesCount= 50000;
		_2020.salesCount();
		System.out.println("\n");
		
		System.out.println("<<<<TVS Jupiter 2019 Info>>>>");
		TVSJupiter _2019_ = new TVSJupiter();
		_2019_.mileage();
		_2019_.salesCount=80000;
		_2019_.salesCount();
		System.out.println("\n");
		
		System.out.println("<<<<TVS Jupiter 2020 Info>>>>");
		TVSJupiter _2020_ = new TVSJupiter();
		_2020_.mileage();
		_2020_.salesCount= 40000;
		_2020_.salesCount();
		
	}
	
	
}