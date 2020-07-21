
class BCCIDecision {
	
	//constructor(BCCIDecision)
	
	int x = 5;
static int y = 7;      //Static block
     int z = 9;
     void peoplesreaction() {
       System.out.println("Angry Faces");
	 }		 
    static void playersreaction() {
		System.out.println("Enjoying Holidays");
	}
}

class IPLcancle {
	
	//constructor(IPLcancle)
	
	public static void main(String[] args) {
		BCCIDecision obj = new BCCIDecision();
		obj.peoplesreaction();
		
		BCCIDecision.playersreaction();
		
	}
}