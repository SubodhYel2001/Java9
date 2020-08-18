class CheckChar {
	
	public static void main(String[] args){
		
		char c = 'a';
		int ascii = c;
		
		if((65 <= ascii) && (ascii <= 90) || (97 <= ascii) && (ascii <= 122)){
			
			System.out.println(c+" is an Alphabet.");
			
		}else if((48 <= ascii) && (ascii <= 57)){
			
			System.out.println(c+" is a Number.");
			
		}else if(((33 <= ascii) && (ascii <= 47)) || ((58 <= ascii) && (ascii <= 64)) || ((91 <= ascii) && (ascii <= 96)) || ((123 <= ascii) && (ascii <= 126))){
			
			System.out.println(c+" is a Special Character.");
			
		}
	}
}