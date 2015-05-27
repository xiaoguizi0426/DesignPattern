package cn.com.gx.behavioral.Visitor;

import cn.com.gx.behavioral.Visitor.Part.Computer;
import cn.com.gx.behavioral.Visitor.Part.ComputerPart;
import cn.com.gx.behavioral.Visitor.Visitor.ComputerPartDisplayVisitor;

public class VisitorPatternDemo
{

	public static void main(String[] args)
	{
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}

}
