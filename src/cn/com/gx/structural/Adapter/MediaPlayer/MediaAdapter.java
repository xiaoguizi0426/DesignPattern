package cn.com.gx.structural.Adapter.MediaPlayer;

import cn.com.gx.structural.Adapter.AdvancedMediaPlayer.AdvancedMediaPlayer;
import cn.com.gx.structural.Adapter.AdvancedMediaPlayer.Mp4Player;
import cn.com.gx.structural.Adapter.AdvancedMediaPlayer.VlcPlayer;

public class MediaAdapter implements MediaPlayer
{
	AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String audioType){
		if(audioType.equalsIgnoreCase("vlc")){
			advancedMediaPlayer = new VlcPlayer();
		}else if(audioType.equalsIgnoreCase("mp4")){
			advancedMediaPlayer = new Mp4Player();
		}
	}

	@Override
	public void play(String audioType, String fileName)
	{
		if(audioType.equalsIgnoreCase("vlc")){
			advancedMediaPlayer.playVlc(fileName);
		}else if(audioType.equalsIgnoreCase("mp4")){
			advancedMediaPlayer.playMp4(fileName);
		}
	}

}
