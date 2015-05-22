package cn.com.gx.behavioral.State.State;

import cn.com.gx.behavioral.State.Context.Context;

public class StopState implements State
{

	@Override
	public void doAction(Context context)
	{
		System.out.println("Player is in stop state");
		context.setState(this);
	}
	
	public String toString(){
		return "Stop State";
	}

}
