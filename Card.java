public class Card {
	
	public int rank;
	private String[] rankNum = {"Ace", "King", "Queen", "Jack", "10",
            "9", "8", "7", "6", "5", "4", "3", "2"};
	
	public Card(int rank){
		this.rank = rank;
	}
		
	public String toString() {
		String card = rankNum[rank];
		return card;	
	}
}
