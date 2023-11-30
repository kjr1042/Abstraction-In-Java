import java.util.Scanner;
abstract class Shape
{
	float area;
	abstract  void acceptInput(); 
	abstract void area() ;
	void disp()
	{
		System.out.println(area);
	}
	
}
class Square extends Shape 
{
	float side;
	void acceptInput()
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the side:");
		side=s.nextFloat();
	}
	void area()
	{
		area =side*side;
	}
}
class Rectangle extends Shape
{
	float length;
	float breadth;
	void acceptInput()
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the length:");
		length=s.nextFloat();
		System.out.println("Enter the breadth:");
		breadth=s.nextFloat();
	}
	void area()
	{
		area=length*breadth;
	}
	
	
}
class Circle extends Shape
{
	float radius;
	void acceptInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Radius:");
		radius = sc.nextFloat();
	}
	void area()
	{
		area =3.14f *radius *radius;
	}
}
class Aeroplane
{
	void permit(Shape ref)
	{
		ref.acceptInput();
		ref.area();
		ref.disp();
	}
}
public class Abstraction1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq=new Square();
		Rectangle r=new Rectangle();
		Circle c=new Circle();
		Aeroplane a=new Aeroplane();
		a.permit(sq);
		a.permit(r);
		a.permit(c);
		

	}

}
