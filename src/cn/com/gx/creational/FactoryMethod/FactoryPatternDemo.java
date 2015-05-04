package cn.com.gx.creational.FactoryMethod;

import cn.com.gx.creational.FactoryMethod.Shape.Shape;

public class FactoryPatternDemo
{

	public static void main(String[] args)
	{
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("SQUARE");
		
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape("RECTANGLE");
		
		shape3.draw();
	}

}
