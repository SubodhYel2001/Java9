

class Array3 {
	
	public static void main(String[] args){
		
		float[] floatnum = new float[5];
		
		float sum = 0,count =0,average = 0;
		
		floatnum[0] = 1.2f;
		floatnum[1] = 12.5f;
		floatnum[2] = 56.23f;
		floatnum[3] = 12.00f;
		floatnum[4] = 88.9f;
		
		System.out.print("\nArray = ");
		for(int i = 0; i < 5; i++){
			
			System.out.print(floatnum[i]+"  ");
			sum = sum + floatnum[i];
			count = count +1;
		}
		System.out.print("\nAverage = ");
		average = sum / count;
		System.out.print(average+"\n");
	}
}