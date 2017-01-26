package patterns.structural.adapter.mediaplayer.before;

import patterns.structural.adapter.mediaplayer.classadapter.AlphaSpeakerImpl;
import patterns.structural.adapter.mediaplayer.classadapter.MediaPlayer;

/**
 *
 * @author Hany
 */
public class Main {
    
    public static void main(String[] args) {
        
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.connectSpeaker(new AlphaSpeakerImpl());
        mediaPlayer.pressVolumeUpButton();
        mediaPlayer.pressVolumeUpButton();
        mediaPlayer.pressVolumeUpButton();
        mediaPlayer.pressVolumeUpButton();
        mediaPlayer.pressPlayButton();
        mediaPlayer.pressStopButton();
        
    }
    
}
