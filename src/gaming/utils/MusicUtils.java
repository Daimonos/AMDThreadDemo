package gaming.utils;

public class MusicUtils {

	private final String RESOURCE_PATH="resources/";
	private String fileName, fullPath;
	private static MusicUtils instance;
	private MusicThread musicThread;
	
	
	private MusicUtils() {}
	
	public static MusicUtils getInstance() {
		if(instance == null) {
			instance = new MusicUtils();
		}
		return instance;
	}
	
	public void setMusic(String path) {
		this.fileName = path;
		fullPath = RESOURCE_PATH+fileName;
		if(musicThread != null) {
			if(musicThread.isAlive())
			System.out.println("Stopping Music Thread");
			stopThread();
		}
		initializeThread();
	}
	
	private void initializeThread() {
		musicThread = new MusicThread(fullPath);
		System.out.println("Starting Thread");
		musicThread.run();
	}
	
	private void stopThread() {
		System.out.println("Stopping Music from Utils");
		musicThread.stopMusic();
	}
	
}
