package cn.com.gx.creational.Singleton;

public class SingleObject
{
	private static SingleObject instance = null;
	
	private SingleObject(){}
	
	public static SingleObject getInstance(){
		if(instance == null){
			instance = new SingleObject();
		}
		return instance;
	}
	
	public void showMessage(){
		System.out.println("Singleton Object!");
	}
}
