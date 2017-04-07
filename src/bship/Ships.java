package bship;

public class Ships {

	public static int row;
	public static int column;
	public static int length;
	public static Direction direction;
	public static boolean sunk;
	public static String shipName;

	public void setShipName(String shipName) {
		Ships.shipName = shipName;
	}

	public String getShipName() {
		return shipName;
	}

	public int getLength() {
		return length;
	}

	void setLocation(int row, int column) {
		Ships.row = row;
		Ships.column = column;
	}

	int getRow() {
		return row;
	}

	int getColumn() {
		return column;
	}

	public void setDirection(Direction directio) {
		direction = directio;
	}

	public Direction getDirection() {
		return direction;
	}

	public boolean isShipSunk() {
		return sunk;
	}

}
