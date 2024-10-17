import java.util.*;

public class Hand implements Comparable<Hand> {
    private final ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card){
        cards.add(card);
    }

    public void print() {
        Iterator<Card> iterator = cards.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void sort() {
        Collections.sort(cards);
    }

    @Override
    public int compareTo(Hand otherHand) {
        int thisValue = cards.stream().map(Card::getValue).reduce(0, Integer::sum);
        int otherValue = otherHand.cards.stream().map(Card::getValue).reduce(0, Integer::sum);

        return Integer.compare(thisValue, otherValue);
    }

    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }
}
