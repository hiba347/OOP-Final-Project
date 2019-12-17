# OOP-Final-Project
Group 7's final project is a Java program on the classic card game, Go Fish.

Go Fish is a card game where 7 cards are dealt to each player and the deck includes 52 cards. In our game, the player plays against computer. In order to play the game, the Human player and the Computer player take turns asking the other if they a specific card. In example, inputting "Do you have any nines?". The card that a player asks should be a card they already have. If the opponent does have the card then they must give it to the person that requested it. If they don't, the player is told "Go Fish," which indicates the player must draw a card from the deck. If the player gets the card requested then they get another turn. The objective of the game is to get the most books, which is 4 of the same rank of cards. The game comes to an end when there are no card left. A winner is determined by which player has the most books. 

Features: 
- create deck
- shuffle deck 
- create player hands
- draw random card from deck 
- Check if player has books, increasing book counter, and removing book from the player hands
- determine winner by comparing amount of books
- check is hand is empty 
