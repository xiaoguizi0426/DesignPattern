package cn.com.gx.behavioral.Visitor.Visitor;

import cn.com.gx.behavioral.Visitor.Part.Computer;
import cn.com.gx.behavioral.Visitor.Part.KeyBoard;
import cn.com.gx.behavioral.Visitor.Part.Monitor;
import cn.com.gx.behavioral.Visitor.Part.Mouse;

public interface ComputerPartVisitor
{
	public void visit(Computer computer);
	public void visit(Mouse mouse);
	public void visit(KeyBoard keyboard);
	public void visit(Monitor monitor);
}
