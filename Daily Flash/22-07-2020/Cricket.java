class Cricket{
	
	public static void main(String[] args){
		
	Cricket viratKohli = new Cricket();
	Cricket mahiDhoni = new Cricket();
	Cricket rohitSharma = new Cricket();
	Cricket cristianoRonaldo = null;
	Cricket lionelMessi = null;
	
	boolean vK = viratKohli instanceof Cricket;
	System.out.println("Virat Kohli is related to Cricket -->           "+vK);
		
	boolean mSD = mahiDhoni instanceof Cricket;
	System.out.println("MahendraShingh Dhoni is related to Cricket -->  "+mSD);
		
	boolean rS = rohitSharma instanceof Cricket;
	System.out.println("Rohit Sharma is related to Cricket -->          "+rS);
		
	boolean cR = cristianoRonaldo instanceof Cricket;
	System.out.println("Cristiano Ronaldo is related to Cricket -->     "+cR);
	
	boolean lM = lionelMessi instanceof Cricket;
	System.out.println("Lionel Messi is related to Cricket -->          "+lM);
		
		
		
	}
	
}