import java.io.*;
import java.util.*;

class EmployeeInfo {

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String empDetails = br.readLine();

		StringTokenizer st = new StringTokenizer(empDetails,",");

		int token1 = Integer.parseInt(st.nextToken().trim());
		String token2 = st.nextToken().trim();
		Double token3 = Double.parseDouble(st.nextToken().trim());

		System.out.println("EmpId : "+token1);
		System.out.println("EmpName : "+token2);
		System.out.println("EmpSalary : "+token3);

	}

}
