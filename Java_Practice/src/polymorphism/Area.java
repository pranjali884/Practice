package polymorphism;

public class Area {
	
	public void arr(double r)
	{
		double cir=3.14*r*r;
		
		//Print area of Circle
		
		System.out.println("area of circle"+cir);
	}
	
	public void arr(int l,int b)
	{
		int rect=l*b;
		
		//Print Area Of Rectangle
		
		System.out.println("area of rectangle"+rect);
	}

}
