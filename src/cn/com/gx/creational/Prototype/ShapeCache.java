package cn.com.gx.creational.Prototype;

import java.util.Hashtable;

import cn.com.gx.creational.Prototype.Shape.Circle;
import cn.com.gx.creational.Prototype.Shape.Rectangle;
import cn.com.gx.creational.Prototype.Shape.Shape;
import cn.com.gx.creational.Prototype.Shape.Square;

public class ShapeCache
{
	private static Hashtable<String,Shape> shapeMap = new Hashtable<String,Shape>();
	
	public static Shape getShape(String shapeId){
		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape)cachedShape.clone();
	}
	
	public static void loadCache(){
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);
		
		Square square = new Square();
		square.setId("2");
		shapeMap.put(square.getId(), square);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapeMap.put(rectangle.getId(), rectangle);
	}
}
