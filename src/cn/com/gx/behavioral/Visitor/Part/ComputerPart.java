package cn.com.gx.behavioral.Visitor.Part;

import cn.com.gx.behavioral.Visitor.Visitor.ComputerPartVisitor;

public interface ComputerPart
{
	public void accept(ComputerPartVisitor computerPartVisitor);
}
