package bship;

public class Destroyer extends Ships {

	public static int destroyerLength = 2;
	public static String shipName = "d";
	
	@Override
	public int getLength() {
		return destroyerLength;
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
