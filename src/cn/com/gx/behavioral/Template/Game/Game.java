package cn.com.gx.behavioral.Template.Game;

public abstract class Game
{
	abstract void initialize();
	abstract void startPlay();
	abstract void endPlay();
	
	public final void play(){
		initialize();
		
		startPlay();
		
		endPlay();
	}
}
