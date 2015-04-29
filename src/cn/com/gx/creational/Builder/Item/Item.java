package cn.com.gx.creational.Builder.Item;

import cn.com.gx.creational.Builder.Packing.Packing;

public interface Item
{
	public String name();
	public Packing packing();
	public float price();
}
