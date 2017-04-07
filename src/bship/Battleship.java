package bship;

public class Battleship extends Ships {

	public static int battleshipLength = 4;
    public static String shipName = "b";
    
	@Override
	public int getLength() {
		return battleshipLength;
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
