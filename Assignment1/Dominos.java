class Dominos {
	
	int price = 0;
	int quantity = 0;
	static int total = 0;

	static void bill(){
		
		
		System.out.println("Total Cost : "+total);
		
		
	}
	
	public static void main(String[] args){
		
		Dominos pizza = new Dominos();
		pizza.price = 300;
		pizza.quantity = 3;
		pizza.total= pizza.price * pizza.quantity;
		pizza.bill();
		
		Dominos fires = new Dominos();
		fires.price = 100;
		fires.quantity = 5;
		fires.total = fires.price * fires.quantity;
		fires.bill();
		
	}
	
}