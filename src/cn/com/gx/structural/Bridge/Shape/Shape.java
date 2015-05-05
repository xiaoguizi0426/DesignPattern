package cn.com.gx.structural.Bridge.Shape;

import cn.com.gx.structural.Bridge.DrawAPI.DrawAPI;

public abstract class Shape
{
	protected DrawAPI drawAPI;
	
	protected Shape(DrawAPI drawAPI){
		this.drawAPI = drawAPI;
	}
	
	public abstract void draw();
}
