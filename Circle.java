public class Circle{
	
	double radius;
	double area;
	
	
	public Circle() {
		radius = 0;
		calculateArea();
	}
	
	public Circle(double radius) {
		this.radius = radius;
		
	}
	
	public double calculateArea() {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}
	
	
	public double getArea() {
		return area;
	}
	
}