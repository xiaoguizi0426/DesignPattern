package cn.com.gx.behavioral.Observer.Observer;

import cn.com.gx.behavioral.Observer.Subject.Subject;

public abstract class Observer
{
	protected Subject subject;
	public abstract void update();
}
