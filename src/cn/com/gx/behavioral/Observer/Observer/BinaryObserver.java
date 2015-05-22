package cn.com.gx.behavioral.Observer.Observer;

import cn.com.gx.behavioral.Observer.Subject.Subject;

public class BinaryObserver extends Observer
{
	public BinaryObserver(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update()
	{
		System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
	}

}
