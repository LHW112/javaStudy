package study2;

public class Study {
	int channel;
	boolean power;
	String color;
	
	void power() {
	power = !power;
	}
	
	void channel1Up() {
		channel++;
	}
	void channel1Down() {
		channel--;
	}
}
