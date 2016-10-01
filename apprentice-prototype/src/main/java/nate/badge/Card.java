package nate.badge;

/**
 * Created by roondog on 9/30/16.
 */
public class Card {

	private String color;
	private int value;

	public Card (String color, int value) {
		this.color = color;
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public String getColor() {
		return color;
	}

}
