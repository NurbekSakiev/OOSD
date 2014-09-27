
public class Triangle extends Shape{
	private int base;
	private int height;
	
	public Triangle(String color, int base, int height) {
		super(color);
		this.base = base;
		this.height = height;
	}
	
	public String toString() {
		return "Triangle of base "+ base + " and height "+ height+", "
				+ "subclass of "+super.toString();
	}
	
	public double getArea() {
		return base/2.0*height;
	}
	
}
