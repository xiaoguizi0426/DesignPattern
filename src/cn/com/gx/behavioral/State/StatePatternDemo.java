package cn.com.gx.behavioral.State;

import cn.com.gx.behavioral.State.Context.Context;
import cn.com.gx.behavioral.State.State.StartState;
import cn.com.gx.behavioral.State.State.StopState;

public class StatePatternDemo
{

	public static void main(String[] args)
	{
		Context context = new Context();
		
		StartState startState = new StartState();
		startState.doAction(context);
		
		System.out.println(context.getState().toString());
		
		StopState stopState = new StopState();
		stopState.doAction(context);
		
		System.out.println(context.getState().toString());
	}

}
