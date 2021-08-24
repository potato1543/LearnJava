package compositionChallenge;

public class Lamp {
	
	private String style;
	private boolean battery;
	private int globRating;
	
	public Lamp(String style, boolean battery, int gloRating) {
		super();
		this.style= style;
		this.battery = battery;
		this.globRating = gloRating;
		
	}

	public String getStyle() {
		return style;
	}

	public boolean isBattery() {
		return battery;
	}

	public int getGlobRating() {
		return globRating;
	}
	
	public void turnOn() {
		System.out.println("Lamp-> Turning on");
	}
	

}
