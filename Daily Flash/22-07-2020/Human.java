class Human{
	
	public static void main(String[] args){
		
		Human lion = null;
		Human tiger = null;
		Human puma = null;
		Human monkey = new Human();
		
		boolean isLionHuman = lion instanceof Human;
		System.out.println("Are Lion and Human of same species -->    "+isLionHuman);
		
		boolean isTigerHuman = tiger instanceof Human;
		System.out.println("Are Tiger and Human of same species -->   "+isTigerHuman);
		
		boolean isPumaHuman = puma instanceof Human;
		System.out.println("Are Puma and Human of same species -->    "+isPumaHuman);
		
		boolean isMonkeyHuman = monkey instanceof Human;
		System.out.println("Are Monkey and Human of same species -->  "+isMonkeyHuman);
		
	}
	
}


/*
 In the above program lion, tiger, puma are not object they are reference only.
 Therefore in the output te answer of first three line are false.
 Hence, Lion, Tiger, Puma are not in the family of Human.
 
 But monkey is object and reference both.
 Therefore the output of fourth line is true 
 Hence, Monkey and Human are of same Family.
 */