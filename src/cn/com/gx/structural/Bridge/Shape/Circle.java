package cn.com.gx.structural.Bridge.Shape;

import cn.com.gx.structural.Bridge.DrawAPI.DrawAPI;

public class Circle extends Shape
{
	private int x,y,radius;
	
	public Circle(int x,int y,int radius,DrawAPI drawAPI){
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw()
	{
		drawAPI.drawCircle(radius, x, y);
	}

}
