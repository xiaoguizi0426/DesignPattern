package cn.com.gx.creational.FactoryMethod;

import cn.com.gx.creational.FactoryMethod.Shape.Circle;
import cn.com.gx.creational.FactoryMethod.Shape.Rectangle;
import cn.com.gx.creational.FactoryMethod.Shape.Shape;
import cn.com.gx.creational.FactoryMethod.Shape.Square;

public class ShapeFactory
{
	public Shape getShape(String shapeType){
		if(shapeType == null){
			return null;
		}
		if(shapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("SQUARE")){
			return new Square();
		}else if(shapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}
		return null;
	}
}
