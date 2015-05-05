package cn.com.gx.creational.Singleton;

public class SingleObject
{
	/**
	 * 当第一次调用getInstance()方法创建并启动时，instance对象为null值，因此系统将执行代码
	 * instance = new SingleObject()，在此过程中，由于要对SingleObject进行大量初始化
	 * 工作，需要一段时间来创建SingleObject对象。而在此时，如果再一次调用getInstance()方法(
	 * 通常发生在多线程环境中)，由于instance尚未创建成功，仍未null值，判断条件instance == null
	 * 为真值，因此代码instance = new SingleObject()将再次执行，导致最终创建了多个instance
	 * 对象，也导致系统运行发生错误。
	 */
//	private static SingleObject instance = null;
//	
//	private SingleObject(){}
//	
//	public static SingleObject getInstance(){
//		if(instance == null){
//			instance = new SingleObject();
//		}
//		return instance;
//	}
	
	/**
	 * 饿汉式单例类
	 * 当类被加载时，静态变量instance会被初始化，此时类的私有构造函数会被调用，单例类的唯一实例将被创建。
	 */
//	private static SingleObject instance = new SingleObject();
//	private SingleObject(){}
//	
//	public static SingleObject getInstance(){
//		return instance;
//	}
	
	/**
	 * 懒汉式单例类
	 * 这里用双重判断的原因：假如在某一个瞬间线程A和线程B都在调用getInstance()方法，此时instance对象为null值，
	 * 均能通过instance == null的判断。由于实现了synchronized加锁机制，线程A进入synchronized锁定的代码
	 * 中执行实例创建代码，线程B处于排队等待状态，必须等待线程A执行完毕后才可以进入synchronized锁定代码。但当A执行
	 * 完毕时，线程B并不知道实例已经创建，将继续创建新的实例，导致产生多个单例对象，所以需要在synchronized中再进行一
	 * 次instance == null判断。
	 */
//	private volatile static SingleObject instance = null;
//	
//	private SingleObject(){}
//	
//	public static SingleObject getInstance(){
//		//第一重判断
//		if(instance == null){
//			//锁定代码块
//			synchronized(SingleObject.class){
//				//第二重判断
//				if(instance == null){
//					//创建单例实例
//					instance = new SingleObject();
//				}
//			}
//		}
//		return instance;
//	}
	
	/**
	 * IoDH
	 * 由于静态单例对象没有作为SingleObject的成员变量直接实例化，因此加载时不会实例化SingleObject，第一次调用
	 * getInstance()时将加载内部类HolderClass，在该内部类中定义了一个static类型的变量instance，此时会首
	 * 先初始化这个变量，由Java虚拟机来保证其线程安全性，确保该成员变量只能初始化一次。由于getInstance()方法没有
	 * 任何线程锁定，因此性能不会造成任何影响。
	 */
	private SingleObject(){}
	
	private static class HolderClass{
		private final static SingleObject instance = new SingleObject();
	}
	
	public static SingleObject getInstance(){
		return HolderClass.instance;
	}
	
	public void showMessage(){
		System.out.println("Singleton Object!");
	}
}
