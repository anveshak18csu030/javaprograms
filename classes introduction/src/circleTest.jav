import java.util.*;
class circle{
	int radius;
	final double PI = 3.14;
	Circle(){
		radius = 1;
	}
	Circle(int radius){
		this.radius = radius;
	}
	void area(){
		System.out.println("Area is : " + (PI * radius *radius));
	}
	void circumference(){
		System.out.println("circumference is : " + (2 * PI * radius));
	}
	void display(){
		System.out.println("radius is : " + radius);
		area();
		circumference();
	}
	public class CirleTest{
		public static void main(String args[]){
			Scanner in = new Scanner(System.in);
			Circle c1 = new Circle();
			c1.display();

			System.out.println("Enter the radius : ");
			int radius = in.nextInt();
			Circle c2 = new Circle(radius);
			c2.display();
		}
	}

}