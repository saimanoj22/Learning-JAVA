
import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {
    @Override
    public int compare(Card c1, Card c2) {
        int suitValueInOrder = c1.getSuit().ordinal() - c2.getSuit().ordinal();
        if(suitValueInOrder == 0){
            suitValueInOrder = c1.compareTo(c2);
        }
        return suitValueInOrder;
    }
}
