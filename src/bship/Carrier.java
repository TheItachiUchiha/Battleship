package bship;

public class Carrier extends Ships {

	public static int carrierLength = 5;
	public static String shipName = "r";

	@Override
	public int getLength() {
		return carrierLength;
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
