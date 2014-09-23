
public class ByTwos implements Series {

	int start =0;
	int val = 0;
	
	public int getNext(){
		System.out.print("The next value is: ");
		return val+=2;
 	}
	public void reset(){
		System.out.println("Resetting...");
		val = 0;
	}
	public void setStart(int x){
		System.out.println("Starting at: "+x);
		val = x;
	}

}
