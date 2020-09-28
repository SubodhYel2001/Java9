import java.io.*;

class Area_Perimeter {
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Length of Side : ");
		int x = Integer.parseInt(br.readLine());
		
		int area, perimeter;
		
		area = x*x;
		
		perimeter = 2*(x + x);
		
		System.out.println("\nArea : "+area+"\n\nperimeter : "+perimeter);
		
		
	}
}