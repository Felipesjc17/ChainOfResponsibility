package main;

public enum Problems {
	
	CONFIGURATIONS(1),
	HARDWARE(2),
	NETWORK(3);
	
	private int value;
	
	Problems(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
