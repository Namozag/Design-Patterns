package patterns.structural.adapter.mediaplayer.objectadapter;

import patterns.structural.adapter.mediaplayer.classadapter.AlphaSpeakerImpl;
import patterns.structural.adapter.mediaplayer.classadapter.MediaPlayer;
import patterns.structural.adapter.mediaplayer.classadapter.BetaSpeakerAdapter;

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
        mediaPlayer.pressPlayButton();
        mediaPlayer.pressStopButton();
        
        mediaPlayer.connectSpeaker(new BetaSpeakerAdapter());
        mediaPlayer.pressVolumeUpButton();
        mediaPlayer.pressVolumeUpButton();
        mediaPlayer.pressPlayButton();
        mediaPlayer.pressStopButton();
        
    }
    
}
