import java.util.*;

public class Player {
	ArrayList<Card> hand = new ArrayList<Card>(); //creates player hand
	int points = 0;
	public Player(Deck deck) {
		for (int i = 0; i < 7; i++) {
			hand.add(deck.getDeck().get(0));
			deck.remove(0);
		}
	}
	
	public ArrayList<Card> getHand() {
		return hand;
	}
	public int getPoints() {
		return points;
	}
	public void drawCard(Deck deck) {
		if (deck.getDeck().size() == 0) {
			return;
		}
		hand.add(deck.getDeck().get(0));
		deck.remove(0);
	}
	public boolean handEmpty() {
		if (hand.size() == 0)
			return true;
		else
			return false;
	}
	public void printHand() {
		String curHand = "Hand: ";
		for (int i = 0; i < hand.size();i++){
			curHand = curHand + hand.get(i).toString() + " ";
		}
		System.out.println(curHand);
	}
	public String getRandomCard() {
		Random r = new Random();	//random num between 0 and handsize
		int low = 0;
		int high = hand.size();
		int result = r.nextInt(high-low) + low;
		return hand.get(result).toString();
	}
	public boolean checkCard(String s) {
		for (int i = 0; i < hand.size(); i++) {
			if (s.equals(hand.get(i).toString().toLowerCase())){
				return true;
			}
		}
		return false;
	}
	public boolean checkBook(String s) {
		int count = 0;
		int positions[] = new int[4];
		for (int i = 0; i < hand.size(); i++) {
			if (s.equals(hand.get(i).toString().toLowerCase())){
				positions[count] = i;
				count++;
			}
		}
		if (count == 4) {
			hand.remove(positions[0]);
			positions[1]--;
			positions[2]--;
			positions[3]--;
			hand.remove(positions[1]);
			positions[2]--;
			positions[3]--;
			hand.remove(positions[2]);
			positions[3]--;
			hand.remove(positions[3]);
			points++;
			return true;
		}
		return false;
	}
	public void transferCard(Player player, String s) {
		for (int i = 0; i < hand.size(); i++) {
			if (s.equals(hand.get(i).toString().toLowerCase())){
				player.getHand().add(hand.get(i));
				hand.remove(i);
			}
		}
	}
}
