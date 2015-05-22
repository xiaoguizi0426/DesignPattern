package cn.com.gx.behavioral.Observer.Observer;

import cn.com.gx.behavioral.Observer.Subject.Subject;

public class OctalObserver extends Observer
{
	public OctalObserver(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update()
	{
		System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
	}

}
