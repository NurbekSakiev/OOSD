

public class SeriesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByTwos twoo = new ByTwos();
		ByThrees three = new ByThrees();
		for (int i = 0;i<5;i++) {
			System.out.println(twoo.getNext());
		}
		twoo.reset();
		
		twoo.setStart(100);
		
		three.reset();
		for (int j=0;j<5;j++) {
			System.out.println(three.getNext());
		}
		three.setStart(100);
		for (int j=0;j<5;j++) {
			System.out.println(three.getNext());
		}
	}

}
