package cn.com.gx.creational.Prototype.Shape;

public abstract class Shape implements Cloneable
{
	private String id;
	protected String type;
	
	abstract void draw();

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}
	
	/**
	 * 在Java中，有两种不同的克隆方法：浅克隆和深克隆。浅克隆和深克隆的主要区别在于是否支持引用类型的成员变量的复制。
	 * 1.浅克隆：在浅克隆中，如果原型对象的成员变量是值类型，将复制一份给克隆对象；如果原型对象的成员变量是引用类型，则
	 * 将引用对象的地址复制一份给克隆对象，也就是说原型对象和克隆对象的成员变量指向相同的内存地址。简单来说，就是值类型的
	 * 成员变量有复制，而引用类型的成员变量没有复制。
	 * 2.深克隆：在深克隆中，无论是原型对象的成员变量是值类型还是引用类型，都将复制一份给克隆对象，深克隆将原型对象的所有
	 * 引用对象也复制一份给克隆对象。
	 * 在Java语言中，如果需要实现深克隆，可以通过序列化等方式来实现。序列化就是将对象写到流的过程，写到流中的对象是原有对
	 * 象的一个拷贝，而原对象仍然存在于内存中。通过序列化实现的拷贝不仅可以复制对象本身，而且可以复制其引用的成员对象，因此
	 * 通过序列化将对象写到一个流中，再从流里将其读出来，可以实现深克隆。
	 */
	@Override
	public Object clone()
	{
		Object clone = null;
		try{
			clone = super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return clone;
	}
	
}	
