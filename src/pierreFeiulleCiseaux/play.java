package pierreFeiulleCiseaux;

import java.util.Random;

import pierreFeiulleCiseaux.Clavier;

public class play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		play2();
	}

	public static void play2() {
		String[] gameTable = { "Pierre", "Feuille", "Ciseau" };
		boolean play = true;
		int gameLoose = 0, gameWin = 0;
		int propositionJeux;
		String rejouer;

		do {
			System.out.println("Bienvenue dans le jeux !\n");
			System.out.println("List des propositions");
			System.out.println("1: Pierre");
			System.out.println("2: Feuille");
			System.out.println("3: Ciseau\n");
			Random random = new Random();
			int nb = random.nextInt(3 - 1 + 1) + 1;
			boolean propoRight = true;
			String result = "Vous avez ";
			do {
				propoRight = true;
				System.out.println("Entrez votre proposition");
				propositionJeux = Clavier.lireInt();
				if (propositionJeux < 1 || propositionJeux > 3) {
					System.out.println("Veuillez entrez une des proposition");
					propoRight = false;
				}

			} while (propoRight == false);

			System.out.println("Vous avez choisi " + gameTable[propositionJeux - 1] + "  et le choix de l'ordi est  "
					+ gameTable[nb - 1]);
			if (propositionJeux == nb) {
				result = "Egalité !\n"; 
			} else if ((propositionJeux == 1 && nb == 3) || (propositionJeux == 2 && nb == 1)
					|| (propositionJeux == 3 && nb == 2)) {
				result += "Gagné !\n";
				gameWin++;
			} else {
				result += "Perdu !\n";
				gameLoose++;
			}

			System.out.println(result);
			System.out.println("Voulez vous rejouer ? O/N");
			rejouer = Clavier.lireString();
			if (rejouer.equals("N")) {
				play = false;
			}

		} while (play);

		System.out.println(gameWin + " Partie gagné");
		System.out.println(gameLoose + " Partie perdu");
	}

	public static void playe() {
		String[] gameTable = { "pierre", "feuille", "ciseau" };
		int play = 0;
		int gameLoose = 0, gameWin = 0;
		int propositionJeux;
		String rejouer;

		do {
			System.out.println("Bienvenue dans le jeux !\n");
			System.out.println("List des propositions");
			System.out.println("1: Pierre");
			System.out.println("2: Feuille");
			System.out.println("3: Ciseau\n");
			Random random = new Random();
			int nb = random.nextInt(gameTable.length - 0) + 0;
			boolean propoRight = true;
			do {
				propoRight = true;
				System.out.println("Entrez votre proposition");
				propositionJeux = Clavier.lireInt();
				switch (propositionJeux) {
				case 1: {

					if (gameTable[nb].equals("pierre")) {

						System.out.println("Egalité\n");

					}
					if (gameTable[nb].equals("feuille")) {

						System.out.println("Perdu !\n");
						gameLoose++;

					}
					if (gameTable[nb].equals("ciseau")) {
						System.out.println("Gagné !\n");
						gameWin++;
					}
					break;

				}
				case 2: {

					if (gameTable[nb].equals("pierre")) {

						System.out.println("Gagné !\n");
						gameWin++;

					}
					if (gameTable[nb].equals("feuille")) {

						System.out.println("egalité \n");

					}
					if (gameTable[nb].equals("ciseau")) {
						System.out.println("Perdu !\n");
						gameLoose++;
					}
					break;
				}
				case 3: {

					if (gameTable[nb].equals("pierre")) {

						System.out.println("Perdu !\n");
						gameLoose++;

					}
					if (gameTable[nb].equals("feuille")) {

						System.out.println("Gagné !\n");
						gameWin++;

					}
					if (gameTable[nb].equals("ciseau")) {
						System.out.println("Egalité \n");
					}
					break;
				}
				default:
					System.out.println("Veuillez entrez une des proposition");
					propoRight = false;
				}
			} while (propoRight == false);

			System.out.println("Voulez vous rejouer ? O/N");
			rejouer = Clavier.lireString();
			if (rejouer.equals("N")) {
				play = 1;
			}

		} while (play == 0);

		System.out.println(gameWin + " Partie gagné");
		System.out.println(gameLoose + " Partie perdu");
	}

}
