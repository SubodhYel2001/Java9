class Instagram{
	
	static void  myPost(Object obj){
		
		String ans;
		ans = (obj instanceof Instagram) ? "OBJECT OF INSTA" : "NOT OBJECT OF INSTA";
		System.out.println(ans);
		
	}
	
}

class Facebook{
	
	public static void main(String[] args){
		
		Instagram post = new Instagram();
		Instagram.myPost(post);
		
		
		
	}
}