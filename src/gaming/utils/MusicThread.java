package gaming.utils;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

public class MusicThread extends Thread {

	private String path;
	File audioFile;
	AudioInputStream audioStream;
	DataLine.Info info;
	Boolean playing;
	Clip audioClip;

	public MusicThread(String path) {
		this.path = path;
	}

	public void run() {
		System.out.println("Starting Thread for: " + path);
		try {
			audioFile = new File(path);
			audioStream = AudioSystem.getAudioInputStream(audioFile);
			info = new DataLine.Info(Clip.class, audioStream.getFormat());
			audioClip = (Clip) AudioSystem.getLine(info);
			audioClip.open(audioStream);
			audioClip.loop(Clip.LOOP_CONTINUOUSLY);
			audioClip.start();
			playing = true;
		} catch (Exception e) {
			System.out.println("Error trying to play track");
			e.printStackTrace();
		}
	}

	public void stopMusic() {
		System.out.println("Stopping Thread");
		audioClip.stop();
	}
}