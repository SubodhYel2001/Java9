class Divisiblity {
	
	public static void main(String[] args){
		
		int num = 55;
		
		if(num % 5 ==0 && num % 11 == 0){
			
			System.out.println(num+" is divisible by "+(num / 11)+" & "+(num / 5));
			
		}else{
			
			System.out.println(num+" is not divisible by "+(num / 11)+" & "+(num / 5));
			
		}
	}
}