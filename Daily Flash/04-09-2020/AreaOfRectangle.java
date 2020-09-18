import java.io.*;


class AreaOfRectangle {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("\nEnter Length : ");
		int l = Integer.parseInt(br.readLine());
	
		System.out.print("\nEnter Breadth : ");
		int b = Integer.parseInt(br.readLine());

		int area;

		area = l * b;

		System.out.println("\nArea of rectangle = "+area);
	}
}
