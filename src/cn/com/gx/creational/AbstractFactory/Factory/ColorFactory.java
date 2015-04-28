package cn.com.gx.creational.AbstractFactory.Factory;

import cn.com.gx.creational.AbstractFactory.Color.Blue;
import cn.com.gx.creational.AbstractFactory.Color.Color;
import cn.com.gx.creational.AbstractFactory.Color.Green;
import cn.com.gx.creational.AbstractFactory.Color.Red;
import cn.com.gx.creational.AbstractFactory.Shape.Shape;

public class ColorFactory extends AbstractFactory
{

	@Override
	public Color getColor(String color)
	{
		if(color == null){
			return null;
		}
		if(color.equalsIgnoreCase("RED")){
			return new Red();
		}else if(color.equalsIgnoreCase("BLUE")){
			return new Blue();
		}else if(color.equalsIgnoreCase("GREEN")){
			return new Green();
		}
		return null;
	}

	@Override
	public Shape getShape(String shape)
	{
		return null;
	}

}
