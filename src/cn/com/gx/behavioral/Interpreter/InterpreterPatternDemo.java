package cn.com.gx.behavioral.Interpreter;

import cn.com.gx.behavioral.Interpreter.Expression.AndExpression;
import cn.com.gx.behavioral.Interpreter.Expression.Expression;
import cn.com.gx.behavioral.Interpreter.Expression.OrExpression;
import cn.com.gx.behavioral.Interpreter.Expression.TerminalExpression;

public class InterpreterPatternDemo
{
	
	public static Expression getMaleExpression(){
		Expression robert = new TerminalExpression("Robert");
		Expression john = new TerminalExpression("John");
		return new OrExpression(robert,john);
	}
	
	public static Expression getMarriedWomanExpression(){
		Expression julie = new TerminalExpression("Julie");
		Expression married = new TerminalExpression("Married");
		return new AndExpression(julie,married);
	}

	public static void main(String[] args)
	{
		Expression isMale = getMaleExpression();
		Expression isMarriedWoman = getMarriedWomanExpression();
		System.out.println("John is male? " + isMale.interpret("John"));
		System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
	}

}
