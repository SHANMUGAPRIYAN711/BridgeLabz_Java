package string.level3;

class DeckOfCards {

    // Method to initialize deck of cards
    static String[] initializeDeck() {

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        String[] deck = new String[suits.length * ranks.length];
        int index = 0;

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index++] = ranks[j] + " of " + suits[i];
            }
        }
        return deck;
    }

    // Method to shuffle the deck
    static void shuffleDeck(String[] deck) {

        for (int i = 0; i < deck.length; i++) {
            int r = i + (int) (Math.random() * (deck.length - i));

            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }

    // Method to distribute cards to players
    static String[][] distributeCards(String[] deck, int players, int cards) {

        String[][] distributed = new String[players][cards];
        int index = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cards; j++) {
                distributed[i][j] = deck[index++];
            }
        }
        return distributed;
    }

    public static void main(String[] args) {

        String[] deck = initializeDeck();
        shuffleDeck(deck);

        int players = 4;
        int cardsPerPlayer = 5;

        String[][] hands = distributeCards(deck, players, cardsPerPlayer);

        for (int i = 0; i < hands.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < hands[i].length; j++) {
                System.out.println(hands[i][j]);
            }
            System.out.println();
        }
    }
}