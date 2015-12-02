package gaming.utils;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

public class MusicThread extends Thread {

	private String path;
	private File audioFile;
	private AudioInputStream audioStream;
	private DataLine.Info info;
	private Clip audioClip;

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
		} catch (Exception e) {
			System.out.println("Error trying to play track");
			e.printStackTrace();
		}
	}

	public void stopMusic() {
		System.out.println("Stopping Thread");
		audioClip.stop();
		audioClip.close();
		try {
			audioStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
