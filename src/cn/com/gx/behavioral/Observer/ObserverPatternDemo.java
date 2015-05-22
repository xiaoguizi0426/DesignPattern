package cn.com.gx.behavioral.Observer;

import cn.com.gx.behavioral.Observer.Observer.BinaryObserver;
import cn.com.gx.behavioral.Observer.Observer.HexaObserver;
import cn.com.gx.behavioral.Observer.Observer.OctalObserver;
import cn.com.gx.behavioral.Observer.Subject.Subject;

public class ObserverPatternDemo
{

	public static void main(String[] args)
	{
		Subject subject = new Subject();
		
		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);
		
		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state change: 10");
		subject.setState(10);
	}

}
