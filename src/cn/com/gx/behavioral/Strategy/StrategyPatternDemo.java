package cn.com.gx.behavioral.Strategy;

import cn.com.gx.behavioral.Strategy.Strategy.OperationAdd;
import cn.com.gx.behavioral.Strategy.Strategy.OperationMultiply;
import cn.com.gx.behavioral.Strategy.Strategy.OperationSubstract;

public class StrategyPatternDemo
{

	public static void main(String[] args)
	{
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
		
		context = new Context(new OperationSubstract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
		
		context = new Context(new OperationMultiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}

}
