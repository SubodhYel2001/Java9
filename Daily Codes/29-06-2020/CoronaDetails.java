class CoronaMaha{
	
	int count = 170000;
	
	void precuation(){
		
		System.out.println("Kalji Gya");
		System.out.println("Count: "+count);
		
		
	}
static void impDecision(){
	
	
	System.out.println("C.M's Decision");
	
}



	public static void main(String[] args){
		
		CoronaMaha Jun28 = new CoronaMaha();
		Jun28.precuation();
		Jun28.impDecision();
		
		CoronaMaha Jun29 = new CoronaMaha();
		Jun29.count=175000;
		Jun29.precuation();
		Jun29.impDecision();
	}

}