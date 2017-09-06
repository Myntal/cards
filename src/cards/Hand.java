package cards;

public class Hand {

    private Card[] hand;

    public Hand(int size) {
        hand = new Card[size];

        for (int i = 0; i < hand.length; i++) {
            hand[i] = new Card();
        }
    }


    //accessors
    public Card[] getHand() {
        return hand;
    }

    //mutators
    public boolean setHand(Card[] c) {
        if (c.length == hand.length) {
            hand = c;
            return true;
        }

        return false;
    }

    public boolean addCard(Card c) {
        for (int i = 0; i < hand.length; i++) {
            if (hand[i].getRank().equals("") && hand[i].getSuite().equals("")) {
                hand[i] = c;
                return true;
            }
        }

        return false;
    }


    public Card removeCard(String suite, String rank) {
        for (int i = 0; i < hand.length; i++) {
            if (hand[i].getRank().equals(rank) && hand[i].getSuite().equals(suite)) {
                Card c = hand[i];
                hand[i] = new Card();
                return c;
            }
        }

        return new Card();
    }


    //
    public boolean hasCard(Card c) {
        for (int i = 0; i < hand.length; i++) {
            if (hand[i] == c) {
                return true;
            }
        }

        return false;
    }

    public boolean hasCard(String suite, String rank) {
        for (int i = 0; i < hand.length; i++) {
            if (hand[i].getRank().equals(rank) && hand[i].getSuite().equals(suite)) {
                return true;
            }
        }

        return false;
    }


}
