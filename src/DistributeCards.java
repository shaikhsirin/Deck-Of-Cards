import java.util.Random;
public class DistributeCards {

    int[][] cards = new int[4][13]; //array of cards
    private int playerNumber;

    //distribute cards to one player
    void DistributeCards(int playerNumber) {
        for (int i = 0; i < 9; i++) {
            giveCard(playerNumber);
        }
    }

    //give only one card Randomly
    void giveCard(int playerNumber) {

        Random random = new Random();

        int suit = random.nextInt(4);
        int rank = random.nextInt(13);

        if (cards[suit][rank] != 0) {
            giveCard(playerNumber);
        } else {
            cards[suit][rank] = playerNumber;
        }
    }

    //Prints cards in ascending order
    void showCards(int playerNumber) {
        for (int suit = 0; suit < 4; suit++) {
            for (int rank = 0; rank < 13; rank++) {
                if (cards[suit][rank] == playerNumber) {
                    System.out.print(getSuit(suit) + " " + getRank(rank) + "\t");
                }
            }
        }
        System.out.println("\n");
    }

}


