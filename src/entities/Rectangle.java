package entities;

public class Rectangle {
	
	public double width; //  - Width: double
	public double height; // - Height: double
	
	public double area() {	// + Area(): double
		return width * height;
	}
	
	public double perimeter() { // + Perimeter(): double
		return 2* (width + height);
	}
	
	public double diagonal() { // + Diagonal(): double
		return Math.sqrt(width * width + height * height);
	}
}