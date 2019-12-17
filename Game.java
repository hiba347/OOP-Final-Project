import java.util.Scanner;

public class Game {
  //establish two players, one human one computer
  //create player hands -- from player class
  //create a loop that check when a player's hand and is empty -- this ends the game 
      // while loops runs, human player asks computer player if they have a certain card, then computer player does the same 
      // must compare hands, search the opposing player for the requested card 
            // if found, give cards to the player that requested it 
                  /*check for books -- go through the player's hand, int counter will increment each time the same rank(number
                     is found, if counter reach 4, book counter for that player increases and those cards are removed from the 
                     player's hand*/
            // else, "go fish" 
                // causes player that asked to draw a random card 
  // if loop ends, compare books
     //if human player's books counter are greater, they win and vice versa
 //terminate program
	
	public static String getCard(String rank) {
		if (rank.equals("ace") || rank.equals("two") || rank.equals("three") || rank.equals("four") ||
				rank.equals("five") || rank.equals("six") || rank.equals("seven") || rank.equals("eight") ||
				rank.equals("nine") || rank.equals("ten") || rank.equals("jack") || rank.equals("queen") || 
				rank.equals("king")){
			return rank.toLowerCase();
		}
		else return "error";
	}
	
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();	//shuffle so player draws random cards
		Player p1 = new Player(deck);
		Player p2 = new Player(deck);	//computer player
		int turnCount = 0;
		//deck.printDeck();
		
		//loop continues till one of the players hand is empty
		while (!p1.handEmpty() && !p2.handEmpty()) {
			if (turnCount % 2 == 0) { //p1 turn
				p1.printHand();
				//p2.printHand();
				System.out.println("what card would you like to check from opponent?");
				Scanner in = new Scanner(System.in);
				String s = in.nextLine();
				String rank = getCard(s.toLowerCase());
				if (rank.equals("error")) {
					System.out.println("Invalid card");
					continue;
				}
				if (p1.checkCard(rank) == false) {
					System.out.println("Error: You do not have the card");
					continue;
				}
				if (p2.checkCard(rank) == false) {
					System.out.println("Go Fish!");
					p1.drawCard(deck);
					boolean hasBook = p1.checkBook(rank);
					if (hasBook == true) {
						System.out.println("P1 got a book of " + rank + "s");
					}
				}
				else if (p2.checkCard(rank) == true) {
					p2.transferCard(p1, rank);
					boolean hasBook = p1.checkBook(rank);
					if (hasBook == true) {
						System.out.println("P1 got a book of " + rank + "s");
					}
					continue;
				}
				turnCount++;
			}
			else if (turnCount % 2 == 1) { //cpu turn
				String rank = p2.getRandomCard().toLowerCase();
				System.out.println("P2 asking for " + rank);
				if (p1.checkCard(rank) == false) {
					System.out.println("cpu goes fish");
					p2.drawCard(deck);
					boolean hasBook = p2.checkBook(rank);
					if (hasBook == true) {
						System.out.println("P2 got a book of " + rank + "s");
					}
				}
				else if (p1.checkCard(rank) == true) {
					p1.transferCard(p2, rank);
					boolean hasBook = p2.checkBook(rank);
					if (hasBook == true) {
						System.out.println("P2 got a book of " + rank + "s");
					}
					continue;
				}
				turnCount++;
			}
		}
		System.out.println("Game Over");
		System.out.println("P1: " + p1.getPoints() + " P2: " + p2.getPoints());
		if (p1.getPoints() > p2.getPoints()) {
			System.out.println("P1 wins");
		}
		else {
			System.out.println("P2 wins");
		}
	}
}
