package cn.com.gx.creational.Builder.Item;

import cn.com.gx.creational.Builder.Packing.Bottle;
import cn.com.gx.creational.Builder.Packing.Packing;

public abstract class ColdDrink implements Item
{

	@Override
	public Packing packing()
	{
		return new Bottle();
	}

	@Override
	public abstract float price();

}
