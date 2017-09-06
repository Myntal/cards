package cards;

public class Card {
    private String suite;
    private String rank;

    public Card() {
        suite = "";
        rank = "";
    }

    public Card(String suite, String rank) {
        this.suite = suite;
        this.rank = rank;
    }

    public String getSuite() {
        return suite;
    }

    public String getRank() {
        return rank;
    }

    public String toString() {
        return rank + " of " + suite;
    }
}
