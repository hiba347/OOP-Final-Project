import java.util.ArrayList;
import java.util.Random;

public class Deck {
	
	 private ArrayList<Card> cards;

	 public Deck(){ //initializes a deck of cards
		 cards = new ArrayList<Card>();
		 
		 for(int i = 0; i <= 12; i++){
			 cards.add(new Card(i));
		 }
	 }
	 
	 public Card drawCard(){ //used when player needs to "Go Fish"
		 Random generator = new Random();
	     int index = generator.nextInt(cards.size());
	     return cards.remove(index);
	 }

	 public String toString(){
		 String result = "Cards left in deck: " + cards;
		 return result;

	 }    
}
