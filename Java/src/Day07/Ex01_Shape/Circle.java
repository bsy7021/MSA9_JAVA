package Day07.Ex01_Shape;

public class Circle extends Shape{
	
	double radius;
	
	
	
	public Circle() {
		this.radius = radius;
	}
	

	public Circle(double radius) {
		this.radius = radius;
	}
	
	

	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
	double area() {
		//원의 넓이 = 원주율 * 반지름 * 반지름
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	double round() {
		//원의 둘레 = 2 * 원주율 * 반지름
		return 2 * Math.PI * radius;
	}


	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
}
