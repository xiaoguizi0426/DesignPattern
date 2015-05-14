package cn.com.gx.structural.Proxy;

import cn.com.gx.structural.Proxy.Image.Image;
import cn.com.gx.structural.Proxy.Image.ProxyImage;

public class ProxyPatternDemo
{

	public static void main(String[] args)
	{
		Image image = new ProxyImage("text_10mb.jpg");
		
		image.display();
		
		image.display();
	}

}
