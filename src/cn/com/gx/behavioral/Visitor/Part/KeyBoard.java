package cn.com.gx.behavioral.Visitor.Part;

import cn.com.gx.behavioral.Visitor.Visitor.ComputerPartVisitor;

public class KeyBoard implements ComputerPart
{

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor)
	{
		computerPartVisitor.visit(this);
	}

}
