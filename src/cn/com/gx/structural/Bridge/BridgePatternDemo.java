package cn.com.gx.structural.Bridge;

import cn.com.gx.structural.Bridge.DrawAPI.GreenCircle;
import cn.com.gx.structural.Bridge.DrawAPI.RedCircle;
import cn.com.gx.structural.Bridge.Shape.Circle;
import cn.com.gx.structural.Bridge.Shape.Shape;

public class BridgePatternDemo
{

	public static void main(String[] args)
	{
		Shape redCircle = new Circle(100,100,10,new RedCircle());
		Shape greenCircle = new Circle(100,100,10,new GreenCircle());
		
		redCircle.draw();
		greenCircle.draw();
	}

}
