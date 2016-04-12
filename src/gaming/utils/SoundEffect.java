package gaming.utils;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;

public class SoundEffect extends Thread implements LineListener {

	private String path;
	private File audioFile;
	private AudioInputStream audioStream;
	private DataLine.Info info;
	private Clip audioClip;

	public SoundEffect(String path) {
		this.path = path;
	}

	public void run() {
		System.out.println("Starting Thread for: " + path);
		try {
			audioFile = new File(path);
			audioStream = AudioSystem.getAudioInputStream(audioFile);
			info = new DataLine.Info(Clip.class, audioStream.getFormat());
			audioClip = (Clip) AudioSystem.getLine(info);
			audioClip.addLineListener(this);
			audioClip.open(audioStream);
			audioClip.start();
		} catch (Exception e) {
			System.out.println("Error trying to play track");
			e.printStackTrace();
		}
	}

	@Override
	public void update(LineEvent event) {
		LineEvent.Type type = event.getType();

		if (type == LineEvent.Type.START) {
			System.out.println("Playback started.");

		} else if (type == LineEvent.Type.STOP) {
			try {
				audioClip.close();
				audioStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Playback completed.");
		}

	}
}
