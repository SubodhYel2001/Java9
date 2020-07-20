class Logical{
	
	public static void main(String[] args){

	int i = 5;
	int j = 4;
	boolean ans;
	
	
	ans = (i++ >= j++) && (--j < i++);
	System.out.println(":::&&:::");
	System.out.println("Ans : "+ans);
	
	
	ans = (--i < j--) || (j++ >= ++i);
	System.out.println(":::||:::");
	System.out.println("Ans : "+ans);


	}
}	