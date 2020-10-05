package pierreFeiulleCiseaux;

import java.util.Random;

import pierreFeiulleCiseaux.Clavier;

/**
 * The Paper Scissor Stone program implements an application
 * which ask the user to choice between paper scissor or stone 
 * and check if the user win or not .
 * The program ask the user if he want to play again and do 
 * the same things as long as the user wants
 * @author ahmed
 *
 */
public class PaperScissorStone {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		//Initialization of the main variables
		String[] gameTable = { "Pierre", "Feuille", "Ciseau" };
		String playAgain;
		String result ;
		int gameLoose = 0, gameWin = 0;
		int userChoice;
		boolean play = true;
		boolean propoRight;
		
		System.out.println("Bienvenue dans le jeux !\n");
		

		do {
			
			menu();
			
			// auto generation of a number between 1 and 3
			Random random = new Random();
			int autoChoice = random.nextInt(3 - 1 + 1) + 1;
			propoRight = true;
			result = "Vous avez ";
			
			/*
			 * ask the user to do a choice between the correct choice
			 * and ask again while the choice is wrong
			 */
			
			do {
				propoRight = true;
				System.out.println("Entrez votre proposition");
				userChoice = Clavier.lireInt();
				if (userChoice < 1 || userChoice > 3) {
					System.out.println("Choix incorect \nVeuillez entrez une des proposition");
					propoRight = false;
				}

			} while (propoRight == false);

			//this display the user and game choice
			System.out.println("Vous avez choisi " + gameTable[userChoice - 1] + "  et le choix de l'ordi est  "
					+ gameTable[autoChoice - 1]);
			
			//This compare the choices and display if the user win or not 
			if (userChoice == autoChoice) {
				result = "Egalité !\n"; 
			} else if ((userChoice == 1 && autoChoice == 3) || (userChoice == 2 && autoChoice == 1)
					|| (userChoice == 3 && autoChoice == 2)) {
				result += "Gagné !\n";
				gameWin++;
			} else {
				result += "Perdu !\n";
				gameLoose++;
			}

			System.out.println(result);
			
			//ask the user if he want to play again or stop the part
			System.out.println("Voulez vous rejouer ? O/N");
			playAgain = Clavier.lireString();
			if (playAgain.equals("N")) {
				play = false;
			}

		} while (play);

	    //Display a number of part win by the user and number of the loose part
		System.out.println(gameWin + " Partie gagné");
		System.out.println(gameLoose + " Partie perdu");
		
	}

	
	/**
	 * This function display only the game 
	 * menu
	 */
	public static void menu() {

		System.out.println("List des propositions");
		System.out.println("1: Pierre");
		System.out.println("2: Feuille");
		System.out.println("3: Ciseau\n");
	}
	


	
}
