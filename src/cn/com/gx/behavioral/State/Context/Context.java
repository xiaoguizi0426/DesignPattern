package cn.com.gx.behavioral.State.Context;

import cn.com.gx.behavioral.State.State.State;

public class Context
{
	private State state;
	
	public Context(){
		state = null;
	}
	
	public void setState(State state){
		this.state = state;
	}
	
	public State getState(){
		return state;
	}
}
