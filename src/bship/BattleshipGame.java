package bship;

public class BattleshipGame {

	public static void main(String[] args) {

		Player playerTwo = new Player2();
		Player playerOne = new Player();
		Board board = new Board(playerOne);
		Board board2 = new Board(playerTwo);
		playerOne.setName("Hemlata");
		System.out.println("Welcome  " + playerOne.getName());

		for (int i = 0; i < 5; i++) {
			System.out.println("Select ship");
			playerOne.selectShip();
			System.out.println("Set direction");
			playerOne.setDirection();
			System.out.println("place ships");
			playerOne.placeShip();
			board.placeShipOnBoard();
		}
		// board.addElementsInArray(); use this if you want ships to be already
		// placed
		board.getArray();

		playerTwo.setName("Hershey");
		System.out.println("Welcome  " + playerTwo.getName());

		for (int i = 0; i < 5; i++) {
			System.out.println("Select ship");
			playerTwo.selectShip();
			System.out.println("Set direction");
			playerTwo.setDirection();
			System.out.println("place ships");
			playerTwo.placeShip();
			board2.placeShipOnBoard();
		}
		// board2.addElementsInarray(); use this if you want ships to be already
		// placed
		board2.getArray();
		for (int i = 0; i <= 20; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("Player 1 : Enter a row and a column to guess the ships: ");
				playerOne.guessTheRowAndColumn();
				boolean check = board.checkIfGuessIsTrue();
				if (check) {
					playerOne.setHit(true);
				} else {
					playerOne.setMiss(true);
				}
				board.setShipToTrueOrFalse();

			}

			for (int j = 0; j < 5; j++) {
				System.out.println("Player 2 : Enter a row and a column to guess the ships: ");
				playerTwo.guessTheRowAndColumn();

				boolean check2 = board2.checkIfGuessIsTrue();
				if (check2) {
					playerTwo.setHit(true);
				} else {
					playerTwo.setMiss(true);
				}
				board2.setShipToTrueOrFalse();
			}

		}

	}

}
