
public class TestArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = new Shape("red");
		Rectangle rec = new Rectangle("blue", 4,7);
		Triangle triangle = new Triangle("green", 2,12);
		
		System.out.println("The area of a Shape is "+shape.getArea());
		System.out.println(rec.toString()+" has area of "+rec.getArea());
		System.out.println(triangle.toString()+ " has area of "+ triangle.getArea());
	}

}
