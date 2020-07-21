class TernaryDemo1{
	
	public static void main(String[] args){
		
		int x = 25;
		int y = 30;
		int z = 35;
		
		int ans = 0;
		
		
		ans = (x > y) ? ((x>z) ? x : z) : ((y > z) ? y : z);
		
		System.out.println(ans);
		
	}
	
}