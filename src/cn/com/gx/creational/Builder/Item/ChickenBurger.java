package cn.com.gx.creational.Builder.Item;

public class ChickenBurger extends Burger
{

	@Override
	public String name()
	{
		return "Chicken Burger";
	}

	@Override
	public float price()
	{
		return 50.5f;
	}

}
