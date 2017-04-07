package bship;

import java.util.Arrays;

public class Board {

	public Ships ship = new Ships();
	public Player player = new Player();

	public Board(Player player) {
		this.player = player;
	}

	int destroyer;
	int cruiser;
	int submarine;
	int battleship;
	int carrier;

	String[][] gridArray = new String[10][10];

	public void placeShipOnBoard() {

		int length = player.getShipLength();
		int row = ship.getRow();
		int column = ship.getColumn();

		if (gridArray[row][column] == null) {
			for (int i = 0; i < length; i++) {
				if (ship.getDirection() == Direction.HORIZONTAL && Player.currentShip.equals("Destroyer")) {
					gridArray[row][column + i] = "d";

				} else if (ship.getDirection() == Direction.HORIZONTAL && Player.currentShip.equals("Cruiser")) {
					gridArray[row][column + i] = "r";

				} else if (ship.getDirection() == Direction.HORIZONTAL && Player.currentShip.equals("Carrier")) {
					gridArray[row][column + i] = "c";

				} else if (ship.getDirection() == Direction.HORIZONTAL && Player.currentShip.equals("Submarine")) {
					gridArray[row][column + i] = "s";

				} else if (ship.getDirection() == Direction.HORIZONTAL && Player.currentShip.equals("Battleship")) {
					gridArray[row][column + i] = "b";

				}

				else if (ship.getDirection() == Direction.VERTICAL && Player.currentShip.equals("Destroyer")) {
					gridArray[row + i][column] = "d";

				} else if (ship.getDirection() == Direction.VERTICAL && Player.currentShip.equals("Cruiser")) {
					gridArray[row + i][column] = "r";
				} else if (ship.getDirection() == Direction.VERTICAL && Player.currentShip.equals("Carrier")) {
					gridArray[row + i][column] = "c";
				} else if (ship.getDirection() == Direction.VERTICAL && Player.currentShip.equals("Submarine")) {
					gridArray[row + i][column] = "s";
				} else if (ship.getDirection() == Direction.VERTICAL && Player.currentShip.equals("Battleship")) {
					gridArray[row + i][column] = "b";
				}

			}
		}
	}

	public void getArray() {
		System.out.println(Arrays.deepToString(gridArray));
	}

	public boolean checkIfGuessIsTrue() {

		System.out.println("getrow " + player.getGridRow());
		System.out.println("getcolumn " + player.getGridColumn());

		if (gridArray[player.getGridRow()][player.getGridColumn()] == "d") {
			gridArray[player.getGridRow()][player.getGridColumn()] = "X";
			destroyer++;
			return true;
		} else if (gridArray[player.getGridRow()][player.getGridColumn()] == "r") {
			gridArray[player.getGridRow()][player.getGridColumn()] = "X";
			cruiser++;
			return true;
		} else if (gridArray[player.getGridRow()][player.getGridColumn()] == "s") {
			gridArray[player.getGridRow()][player.getGridColumn()] = "X";
			submarine++;
			return true;
		} else if (gridArray[player.getGridRow()][player.getGridColumn()] == "b") {
			gridArray[player.getGridRow()][player.getGridColumn()] = "X";
			battleship++;
			return true;
		} else if (gridArray[player.getGridRow()][player.getGridColumn()] == "c") {
			gridArray[player.getGridRow()][player.getGridColumn()] = "X";
			carrier++;
			return true;
		}
		return false;
	}

	public void setShipToTrueOrFalse() {
		if (destroyer == 2) {
			Destroyer.sunk = true;
			System.out.println("Destroyer has been sunk");
		}
		if (cruiser == 3) {
			Cruiser.sunk = true;
			System.out.println("Cruiser has been sunk");
		}
		if (submarine == 3) {
			Submarine.sunk = true;
			System.out.println("Submarine has been sunk");
		}
		if (carrier == 5) {
			Carrier.sunk = true;
			System.out.println("Carrier has been sunk");
		}
		if (battleship == 4) {
			Battleship.sunk = true;
			System.out.println("Battleship has been sunk");
		}

	}
	/**
	 * use this if you want ships to be already placed
	 * 
	 * 
	 * 
	  public void addElementsInArray() { 
	  gridArray[0][1] = "c";
	  gridArray[0][2]= "c";
	  gridArray[0][3] = "c";
	  gridArray[0][4] = "c";
	  gridArray[0][5] ="c";
	  gridArray[2][2] = "d"; 
	  gridArray[3][2] = "d";
	  gridArray[7][2] = "s";
	  gridArray[8][2] = "s";
	  gridArray[9][2] = "s"; 
	  gridArray[5][4] = "r";
	  gridArray[5][5] = "r"; 
	  gridArray[5][6] = "r"; 
	  gridArray[6][7] = "b";
	  gridArray[7][7] = "b"; 
	  gridArray[8][7] = "b";
	  gridArray[9][7] = "b";
	  } 
	  
	  public void addElementsInArray2() { 
	  gridArray[5][4] = "c";
	  gridArray[6][4] = "c";
	  gridArray[7][4] = "c";
	  gridArray[8][4] = "c";
	  gridArray[9][4] = "c";
	  gridArray[0][2] = "d"; 
	  gridArray[0][3] = "d";
	  gridArray[7][5] = "s"; 
	  gridArray[8][5] = "s";
	  gridArray[9][5] = "s";
	  gridArray[8][1] = "r";
	  gridArray[8][2] = "r";
	  gridArray[8][3] = "r";
	  gridArray[4][5] = "b"; 
	  gridArray[4][6] = "b";
	  gridArray[4][7] = "b";
	  gridArray[4][8] = "b"; 
	  }
	 */
}
