package bship;

public class Submarine extends Ships {

	public static int submarineLength = 3;
	public static String shipName = "s";

	@Override
	public int getLength() {
		return submarineLength;
	}

	@Override
	public void setShipName(String shipName) {
		Cruiser.shipName = shipName;
	}

	@Override
	public String getShipName() {
		return shipName;
	}
}
