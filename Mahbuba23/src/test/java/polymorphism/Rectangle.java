package polymorphism;

public class Rectangle extends Shape {

	double length,width;
	Rectangle(double length,double width){
		this.length=length;
		this.width=width;		
	}
	
	double area() {
		System.out.print("The area of Rectangle : ");
		return length*width;
	}
}
