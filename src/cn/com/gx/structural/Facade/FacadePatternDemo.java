package cn.com.gx.structural.Facade;

public class FacadePatternDemo
{

	public static void main(String[] args)
	{
		ShapeMaker shapeMaker = new ShapeMaker();
		
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}

}
