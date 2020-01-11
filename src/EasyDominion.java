
//import textio.TextIO;

/**
 * This program lets the user play HighLow, a simple card game
 * that is described in the output statements at the beginning of
 * the main() routine.  After the user plays several games,
 * the user's average score is reported.
 */
public class EasyDominion {

    public static void main(String[] args) {

        System.out.println("Simple Dominion Game");
        System.out.println();

        int gamesPlayed = 0;     // Number of games user has played.
        int sumOfScores = 0;     // The sum of all the scores from
        //      all the games played.
        double averageScore;     // Average score, computed by dividing
        //      sumOfScores by gamesPlayed.
        boolean playAgain;       // Record user's response when user is
        //   asked whether he wants to play
        //   another game.

        do {
            int scoreThisGame;        // Score for one game.
            scoreThisGame = play();   // Play the game and get the score.
            sumOfScores += scoreThisGame;
            gamesPlayed++;
            System.out.print("Play again? ");
            //playAgain = TextIO.getlnBoolean();
            playAgain = false;
        } while (playAgain);

        averageScore = ((double) sumOfScores) / gamesPlayed;

        System.out.println();
        System.out.println("You played " + gamesPlayed + " games.");
        System.out.printf("Your average score was %1.3f.\n", averageScore);

    }  // end main()


    /**
     * Play one game of Dominion, return the Victory Point score
     */
    private static int play() {

        Hand h = new Hand();
        int handValue = 0;

        // Deck deck = new Deck();  // Get a new deck of cards, and
        //   store a reference to it in
        //   the variable, deck.

        for (int i=0;i<3;i++) {
            Card c = new Card(3,Card.VICTORY);
            h.addCard(c);
        }
        for (int i=0;i<7;i++) {
            Card c = new Card();
            h.addCard(c);
        }

        for (int i=0;i<h.getCardCount();i++) {
            Card c = h.getCard(i);
            System.out.println(c.toString());
            handValue += c.getValue();
        }

        return handValue;
    }
}