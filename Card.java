public class Card {
	
	public int rank; // 0 = Ace, 1 = 2, 2 = 3, ... , 9 = 10, 10 = Jack, 11 = Queen 12 = King
	//private String[] rankNum = {"Ace", "King", "Queen", "Jack", "10",
          //  "9", "8", "7", "6", "5", "4", "3", "2"};
	
	public Card(int rank){
		this.rank = rank;
	}
		
	public String toString() {
		String card = "";
		switch(rank) {
		case 0: card = "Ace";
			break;
		case 1: card = "Two";
			break;
		case 2: card = "Three";
			break;
		case 3: card = "Four";
			break;
		case 4: card = "Five";
			break;
		case 5: card = "Six";
			break;
		case 6: card = "Seven";
			break;
		case 7: card = "Eight";
			break;
		case 8: card = "Nine";
			break;
		case 9: card = "Ten";
			break;
		case 10: card = "Jack";
			break;
		case 11: card = "Queen";
			break;
		case 12: card = "King";
			break;
		}
		return card;	
	}
}
