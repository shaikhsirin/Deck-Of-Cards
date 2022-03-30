import java.util.Random;
public class DistributeCards {

    int[][] cards = new int[4][13]; //array of cards

    //distribute cards to one player
    void DistributeCards(int playerNumber) {
        for (int i = 0; i < 9; i++) {
            giveCard(playerNumber);
        }
    }

    private void giveCard(int playerNumber) {
    }
}