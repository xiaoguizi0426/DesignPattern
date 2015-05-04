package cn.com.gx.structural.Adapter.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer
{

	@Override
	public void playVlc(String fileName)
	{

	}

	@Override
	public void playMp4(String fileName)
	{
		System.out.println("Playing mp4 file. Name:" + fileName);
	}

}
