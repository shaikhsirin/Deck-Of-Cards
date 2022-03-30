public class DeckOfCards {
    public static void main(String[] args) {
        DistributeCards distributeCards = new DistributeCards(); //class object

        // Cards for each player
        for (int playerNumber = 1; playerNumber <= 4; playerNumber++) {
            distributeCards.DistributeCards(playerNumber);
            System.out.println("Player " + playerNumber + "'s cards:");
        }
    }
}
