
public class ByThrees implements Series{

	int start;
	int val;
	
	public int getNext(){
		System.out.print("The next value is: ");
		return val+=3;
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
