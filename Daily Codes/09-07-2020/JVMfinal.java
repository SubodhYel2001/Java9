class Core2web{
	
	static int totalStudCount = 2500;
		   int batchStudCount = 0;
		   
		   
		   void dispStudCount(){
			   
			   System.out.println("Total Student Count = "+totalStudCount);
			   System.out.println("Batch Student Count = "+batchStudCount);
			   
		   }
}

class C2WAppAdmin{
	
	static int totalLoginCount = 1200;
		   int videoCount = 0;
		   
		   void dispStat(){
			   
			   System.out.println("Total Login Count = "+totalLoginCount);
			   System.out.println("Vodio Count = "+videoCount);
		   }
}

class Mentor{
	
	public static void main(String[] args){
	
		Core2web java9_10 = new Core2web();
		
		java9_10.batchStudCount = 370;
		java9_10.dispStudCount();
		
		Core2web ppa5 = new Core2web();
		
		ppa5.batchStudCount = 290;
		ppa5.dispStudCount();
		
		C2WAppAdmin python0 = new C2WAppAdmin();
		
		python0.videoCount = 25;
		python0.dispStat();
		
		C2WAppAdmin os = new C2WAppAdmin();
		
		os.videoCount = 25;
	    os.dispStat();
		

	}		
}