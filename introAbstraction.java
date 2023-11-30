abstract class Plane
{
	abstract void takeOff();
	abstract void fly();
	abstract void land();
}
class CargoPlane extends Plane
{
	void takeOff()
	{
		System.out.println("CargoPlane is takingOff");
	}
	void fly()
	{
		System.out.println("CargoPlane is flying");
	}
	void land()
	{
		System.out.println("CargoPlane is Landing");
	}
}


public class introAbstraction {
	public static void main(String args[])
	{
		CargoPlane cp =new CargoPlane();
		cp.takeOff();
		cp.fly();
		cp.takeOff();
	}

}
