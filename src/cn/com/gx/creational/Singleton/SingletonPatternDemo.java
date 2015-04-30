package cn.com.gx.creational.Singleton;

public class SingletonPatternDemo
{

	public static void main(String[] args)
	{
		SingleObject object = SingleObject.getInstance();
		
		object.showMessage();
	}

}
