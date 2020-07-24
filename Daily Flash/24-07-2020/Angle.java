class Angle {
	
	public static void main(String[] args){
		
		int angle = 85;
		
		if((angle >= 0) && (angle < 90)){
			
			System.out.println("Angle = "+angle);
			System.out.println("Acute angle");
			
		}else {
			
			if (angle == 90){
				
				System.out.println("Angle = "+angle);
				System.out.println("Right angle");
				
			}else {
				
				System.out.println("Angle = "+angle);
				System.out.println("Obtuse angle");
				
			}
			
			
			
		}
		
	}
		
}