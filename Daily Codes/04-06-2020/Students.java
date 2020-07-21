import java.lang.*;
class Examscancle {
	
	//constructor(Examscancle)
	
	int x = 10;
static int y = 20;      //Static block
     int z = 30;
	 
     void happy() {
       System.out.println("Thanks CM");
	 }		 
    static void decisionPending() {
		System.out.println("Angry Faces");
	}
}

class Students {
	
	//constructor(Students)
	
	public static void main(String[] args) {
		Examscancle obj = new Examscancle();
		obj.happy();
		//decisionPending();
		obj.decisionPending();
		Examscancle.decisionPending();
		
	}
}