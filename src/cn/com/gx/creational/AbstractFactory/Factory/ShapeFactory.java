package cn.com.gx.creational.AbstractFactory.Factory;

import cn.com.gx.creational.AbstractFactory.Color.Color;
import cn.com.gx.creational.AbstractFactory.Shape.Circle;
import cn.com.gx.creational.AbstractFactory.Shape.Rectangle;
import cn.com.gx.creational.AbstractFactory.Shape.Shape;
import cn.com.gx.creational.AbstractFactory.Shape.Square;

public class ShapeFactory extends AbstractFactory
{

	@Override
	public Color getColor(String color)
	{
		return null;
	}

	@Override
	public Shape getShape(String shape)
	{
		if(shape == null){
			return null;
		}
		if(shape.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}else if(shape.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}else if(shape.equalsIgnoreCase("SQUARE")){
			return new Square();
		}
		return null;
	}

}
