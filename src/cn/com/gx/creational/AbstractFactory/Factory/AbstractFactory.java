package cn.com.gx.creational.AbstractFactory.Factory;

import cn.com.gx.creational.AbstractFactory.Color.Color;
import cn.com.gx.creational.AbstractFactory.Shape.Shape;

public abstract class AbstractFactory
{
	public abstract Color getColor(String color);
	public abstract Shape getShape(String shape);
}
