package bship;

import java.util.Scanner;

public class Player {

	public Ships ship = new Ships();
	public Board board;
	public String playerName;
	public boolean hit;
	public boolean miss;
	public Cruiser cruiser = new Cruiser();
	public Destroyer destroyer = new Destroyer();
	public Carrier carrier = new Carrier();
	public Submarine submarine = new Submarine();
	public Battleship battleship = new Battleship();
	public static int length;
	public static String currentShip;
	private int firstGuess;
	private int secondGuess;
	Scanner input = new Scanner(System.in);

	public void setName(String playerName) {
		this.playerName = playerName;
	}

	public String getName() {
		return playerName;
	}

	public void selectShip() {

		currentShip = input.nextLine();
		switch (currentShip) {

		case "Destroyer":
			length = destroyer.getLength();
			break;
		case "Cruiser":
			length = cruiser.getLength();
			break;
		case "Carrier":
			length = carrier.getLength();
			break;
		case "Submarine":
			length = submarine.getLength();
			break;
		case "Battleship":
			length = battleship.getLength();
			break;
		default:
			System.out.println("There is no ship named as " + currentShip);
		}

	}

	public int getShipLength() {
		return length;
	}

	public void setDirection() {

		String direction = input.nextLine();
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

	public void placeShip() {

		int row = input.nextInt();
		int column = input.nextInt();
		input.nextLine();
		ship.setLocation(row, column);
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

		firstGuess = input.nextInt();
		secondGuess = input.nextInt();
		setGridRow(firstGuess);
		setGridColumn(secondGuess);

	}
	

	public void setGridColumn(int secondGuess) {
		this.secondGuess = secondGuess;

	}

	public void setGridRow(int firstGuess) {
		this.firstGuess = firstGuess;

	}

	public int getGridRow() {
		return firstGuess;
	}

	public int getGridColumn() {
		return secondGuess;
	}

}
