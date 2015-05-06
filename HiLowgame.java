import java.util.Scanner;

public class HiLowgame {

	public static void main(String[] args) {
		String play = "yes";
		int mdice;
		int ppoint = 0;
		int numbergame = 0;
		String playerguess;
		Scanner input = new Scanner(System.in);
		while (play.toLowerCase().equals("yes")) {
			System.out.println("Welcome to the Hi-Low game!!!");
			System.out.print("Enter you dice to throw: ");
			mdice = input.nextInt();
			dice cdice = new dice(mdice);
			cdice.cthrow();
			System.out.println("Enter your guess:( hi, low or a number):");
			playerguess = input.next();
			playerguess.toLowerCase().equals(playerguess);
			ppoint = cdice.process(playerguess, ppoint);
			numbergame++;
			System.out.println("the Scores: " + ppoint);
			System.out.println("number of games you have played : "
					+ numbergame);
			System.out.println("do you want to play again??( Yes/No) ");
			play = input.next();
		}
		System.out.println("Total point : " + ppoint);
	}

}
