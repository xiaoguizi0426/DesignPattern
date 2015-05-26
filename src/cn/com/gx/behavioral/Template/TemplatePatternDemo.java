package cn.com.gx.behavioral.Template;

import cn.com.gx.behavioral.Template.Game.Cricket;
import cn.com.gx.behavioral.Template.Game.Football;
import cn.com.gx.behavioral.Template.Game.Game;

public class TemplatePatternDemo
{

	public static void main(String[] args)
	{
		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();
	}

}
