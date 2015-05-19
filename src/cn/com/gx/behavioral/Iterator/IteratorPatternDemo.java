package cn.com.gx.behavioral.Iterator;

import cn.com.gx.behavioral.Iterator.Container.NameRepository;
import cn.com.gx.behavioral.Iterator.Iterator.Iterator;

public class IteratorPatternDemo
{
	
	public static void main(String[] args)
	{
		NameRepository nameRepository = new NameRepository();
		
		for(Iterator iter = nameRepository.getIterator();iter.hasNext();){
			String name = (String)iter.next();
			System.out.println("Name: " + name);
		}
	}

}
