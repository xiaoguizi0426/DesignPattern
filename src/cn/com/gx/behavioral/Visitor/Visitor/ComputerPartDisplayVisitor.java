package cn.com.gx.behavioral.Visitor.Visitor;

import cn.com.gx.behavioral.Visitor.Part.Computer;
import cn.com.gx.behavioral.Visitor.Part.KeyBoard;
import cn.com.gx.behavioral.Visitor.Part.Monitor;
import cn.com.gx.behavioral.Visitor.Part.Mouse;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor
{

	@Override
	public void visit(Computer computer)
	{
		System.out.println("Displaying Computer.");
	}

	@Override
	public void visit(Mouse mouse)
	{
		System.out.println("Displaying Mouse.");
	}

	@Override
	public void visit(KeyBoard keyboard)
	{
		System.out.println("Displaying KeyBoard.");
	}

	@Override
	public void visit(Monitor monitor)
	{
		System.out.println("Displaying Monitor.");
	}

}
