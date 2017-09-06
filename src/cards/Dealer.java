package cards;

public class Dealer implements Person {
    private String firstName;
    private String lastName;
    private Deck deck;

    public Dealer(String firstName) {
        this.firstName = firstName;
    }

    public Dealer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Dealer(String firstName, String lastName, Deck deck) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.deck = deck;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getWholeName() {
        return firstName + ' ' + lastName;
    }
}
