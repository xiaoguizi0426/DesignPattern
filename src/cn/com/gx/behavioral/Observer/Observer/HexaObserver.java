package cn.com.gx.behavioral.Observer.Observer;

import cn.com.gx.behavioral.Observer.Subject.Subject;

public class HexaObserver extends Observer
{
	public HexaObserver(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update()
	{
		System.out.println("Hex String: " + Integer.toHexString(subject.getState()));
	}

}
