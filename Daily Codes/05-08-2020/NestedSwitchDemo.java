

class NestedSwitchDemo{
	
	public static void main(String[] args){
		
		int floor = 1;
		
		switch(floor){
			
			case 1 :
			{
				char ch = 'f'; //s for service and f for food
				System.out.println("First Floor");
				switch(ch) {
					
					case 'S' :
					case 's' :
							System.out.println("Shopping");
							break;
							
					case 'F' :
					case 'f' :
							System.out.println("Nust Khaich");
							break;
					default : 
							System.out.println("Service not Available");
					
				}
				
				
			}
					break;
					
			case 2 : 
				{
					char ch = 'M'; //m for movie and p for playstation
				System.out.println("Second Floor");
					switch(ch) {
					
						case 'M' :
						case 'm' :
								System.out.println("Dil Bechara");
								break;
							
						case 'P' :
						case 'p' :
								System.out.println("Football");
								break;
						default : 
								System.out.println("Service not Available");
					}
				}
			
					break;
					
			default :
			
					System.out.println("Wrong Floor");
					break;
			
			
			
		}
		
		
	}
	
}