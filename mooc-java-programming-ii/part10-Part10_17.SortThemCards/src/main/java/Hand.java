import java.util.ArrayList;
import java.util.Collections;
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cardsInHand;
    
    public Hand(){
        this.cardsInHand = new ArrayList<>();
    }
    
    public void add(Card card){
        this.cardsInHand.add(card);
    }
    
    public void print(){
        for(Card card : this.cardsInHand){
            System.out.println(card);
        }
    }
    
    public int sum(){
        int sum = 0;
        for(Card card : this.cardsInHand){
            sum += card.getValue();
        }
        return sum;
    }
    
    public void sort(){
        Collections.sort(this.cardsInHand);
    }
    
    public void sortBySuit(){
        Collections.sort(this.cardsInHand, new BySuitInValueOrder());
    }
    
    @Override
    public int compareTo(Hand hand){
        return this.sum() - hand.sum();
    }
}
