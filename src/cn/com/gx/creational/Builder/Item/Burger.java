package cn.com.gx.creational.Builder.Item;

import cn.com.gx.creational.Builder.Packing.Packing;
import cn.com.gx.creational.Builder.Packing.Wrapper;

public abstract class Burger implements Item
{

	@Override
	public Packing packing()
	{
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
