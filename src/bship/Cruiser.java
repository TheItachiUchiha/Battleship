package bship;

public class Cruiser extends Ships {

	public static int cruiserLength = 3;
	public static String shipName = "c";

	@Override
	public int getLength() {
		return cruiserLength;
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
