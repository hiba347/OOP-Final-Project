import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
	
	 private ArrayList<Card> cards;

	 public Deck(){ //initializes a deck of cards
		 cards = new ArrayList<Card>();
		 for (int j = 0; j < 4; j++) {		 
			 for(int i = 0; i <= 12; i++){
				 cards.add(new Card(i));
			 }
		 }
	 }
	 
	 public void shuffle() {
		 Collections.shuffle(cards);
	 }
	 public Card drawCard(){ //used when player needs to "Go Fish"
		 Random generator = new Random();
	     int index = generator.nextInt(cards.size());
	     return cards.remove(index);
	 }

	 public String toString(){
		 String result = "Cards left in deck: " + cards.size();
		 return result;
	 }    
	 public ArrayList<Card> getDeck() {
		 return cards;
	 }
	 public void remove(int i) {
		 cards.remove(i);
	 }
	 public void printDeck() {
		 System.out.println("cards size is :" + cards.size());
		 for (int i = 0; i < cards.size(); i++) {
			 System.out.println(cards.get(i));
		 }
	 }
}
