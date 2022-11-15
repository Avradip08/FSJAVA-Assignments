package World;

import java.util.*;

class Guesser
{
	int guessNum;
	
	int guessNum()
	{
		Random r=new Random();
		System.out.println("Guesser kindly guess the number");
		guessNum = r.nextInt(500);
		System.out.println(guessNum);
		return guessNum;
	}
}

class Player
{
	int guessNum;
	static int players;
	static int getPlayers()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("How many players are playing");
		players=scan.nextInt();
		return players;
	}
	int guess(int x) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Player" + x + " please take a guess: ");
		guessNum=scan.nextInt();
		return guessNum;
	}
}

class Umpire
{
	static int noOfPlayers; 
	int numFromGuesser;
	int[] guessOfPlayers;
	
	void collectNoOfPlayers() {
		noOfPlayers = Player.getPlayers();
		guessOfPlayers = new int[noOfPlayers];
	}
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	void collectNumFromPlayers()
	{
		for(int i=0;i<noOfPlayers;++i) {
			Player p=new Player();
			guessOfPlayers[i]=p.guess(i+1);
		}
	}
	boolean compare()
	{
		List<Integer> winners= new ArrayList<Integer>();
		for(int i=0;i<noOfPlayers;++i) {
			if(guessOfPlayers[i]==numFromGuesser) {
				winners.add(i+1);
			}
		}
		if(winners.isEmpty()) {
			//provide hints to all players that are playing
			System.out.println("NO PLAYER WON THE GAME SO I AM PROVIDING HINTS TO ALL");
			for(int i=0;i<noOfPlayers;++i) {
				if(guessOfPlayers[i]>numFromGuesser) {
					System.out.println("Player"+(i+1)+" please guess lower");
				}
				else {
					System.out.println("Player"+(i+1)+" please guess higher");
				}
			}
			return false;
		}
		else {
			System.out.println("Game is won by the players: ");
			for(int i=0;i<winners.size();++i) {
				System.out.println("Player"+winners.get(i));
			}
			return true;
		}
	}
	
	void play() {
		boolean f=true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rounds you want to play!");
		int rounds = sc.nextInt();
		for(int i=0;i<rounds;++i){
			collectNumFromPlayers();
			if(compare()) {
				f=false;
				break;
			}
			System.out.println("NUMBER OF ROUNDS TO GO: " + (rounds-i-1));
		}
		if(f) {
			System.out.println("SORRY NOBODY WON THE GAME");
		}
	}
	
}


public class LaunchGame {

	public static void main(String[] args) {
		
			Umpire u=new Umpire();
			u.collectNoOfPlayers();
			u.collectNumFromGuesser();
			u.play();
	}

}
