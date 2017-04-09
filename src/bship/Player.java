package bship;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Player {

    private Board board = new Board();
    private List<Ship> ships = Arrays.asList(new Cruiser(), new Destroyer(), new Carrier(), new Submarine(), new Battleship());

	/** The default ship for player is Cruiser.
	 * They can change it when they want to...
	 */
	private Ship ship = new Cruiser();

	private String playerName;
	private boolean hit;
	// We don't need this variable?
	private boolean miss;

    private int firstGuess;
	private int secondGuess;

	private final Scanner scannerIn = new Scanner(System.in);

    /**
     * By default all the player have Submarine. They can change it later.
     * @param name Player name.
     */
	public Player (String name) {
	    this.playerName = name;
	    this.ship = new Submarine();
    }

	public String getName() {
		return playerName;
	}

	public void selectShip() {

        String currentShipName = scannerIn.nextLine();
        int i = 0;
		for (; i < ships.size(); i++) {
		    if(ships.get(i).getShipName().equalsIgnoreCase(currentShipName)) {
                ship = ships.get(i);
                break;
            }
        }
		if (i > ships.size()) {
			System.out.println("There is no ship named as " + currentShipName);
		}

	}

	public int getShipLength() {
		return ship != null ? ship.getLength() : 0;
	}

	public void setDirection() {
		String direction = scannerIn.nextLine();
		if (ship != null) {
            switch (direction) {
                case "Horizontal":
                    ship.setDirection(Direction.HORIZONTAL);
                    break;
                case "Vertical":
                    ship.setDirection(Direction.VERTICAL);
                    break;
                default:
                    System.out.println("There is no direction as " + direction);
            }
        }
	}

	public void placeShip() {
		int row = scannerIn.nextInt();
		int column = scannerIn.nextInt();
		scannerIn.nextLine();
		ship.setLocation(new Location(row, column));
	}

	public void setHit(boolean hit) {
		this.hit = hit;
	}

	public boolean getHit() {
		return hit;
	}

	public void setMiss(boolean miss) {
		this.miss = miss;
	}

	public boolean getMiss() {
		return miss;
	}

	public void guessTheRowAndColumn() {
		firstGuess = scannerIn.nextInt();
		secondGuess = scannerIn.nextInt();
		setGridRow(firstGuess);
		setGridColumn(secondGuess);
	}
	

	public void setGridColumn(int secondGuess) {
		this.secondGuess = secondGuess;

	}

	public void setGridRow(int firstGuess) {
		this.firstGuess = firstGuess;
	}

	public Ship getShip() {
		return ship;
	}

	public int getGridRow() {
		return firstGuess;
	}

	public int getGridColumn() {
		return secondGuess;
	}

}
