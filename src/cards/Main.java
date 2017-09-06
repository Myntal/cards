package cards;

public class Main {
    public static void main(String[] args) {
//        Deck d = new Deck();
//
//        System.out.println(d.printDeck());
//        d.shuffleDeck();
//        System.out.println(d.printDeck());
//
//
//        Card[] hand1 = new Card[5];
//
//        for (int i = 0; i < hand1.length; i++) {
//            hand1[i] = d.dealCard();
//        }
//
//        for (int i = 0; i < hand1.length; i++) {
//            System.out.println(hand1[i].toString());
//        }
//
//        for (int i = 0; i < hand1.length; i++) {
//            d.addCard(hand1[i]);
//            hand1[i] = null;
//        }
//
//        System.out.println("\n");
//        System.out.println(d.printDeck());

        Player p = new Player("first", "last");
        BlackjackPlayer b = new BlackjackPlayer("other", "player");

        System.out.println(p.getWholeName());
        System.out.println(b.getWholeName());
    }
}
