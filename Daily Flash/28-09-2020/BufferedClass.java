import java.io.*;

class BufferedClass {
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Name : ");
		String name = br.readLine();
		
		System.out.print("Roll No. : ");
		int rollNo = Integer.parseInt(br.readLine());
		
		System.out.print("Feild of Interest : ");
		String feildOfInterest = br.readLine();
		
		System.out.println("\n\nHey, my name is "+name+" and my roll no. is "+rollNo+". My feild of interest are "+feildOfInterest+".");
	}
}