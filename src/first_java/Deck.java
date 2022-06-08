package first_java;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards;

    public ArrayList<Card> getCards(){
        return cards;
    }
    public void addCard(Card card){
        cards.add(card);
    }
    public void print(){
        for (Card card : cards){
            System.out.println(card.toString());
        }
    }
    public void shuffle(){ // 랜덤 섞기
        Random ran = new Random();
        for (int i = 0; i < cards.size(); i++){
            int randIndex = ran.nextInt(cards.size()); // 랜덤 인덱스는 카드의 사이즈 만큼 랜덤 생성
            Card temp = cards.get(i); // 새로운 카드생성 => 카드들의 i번째 값
            cards.set(i, cards.get(randIndex)); // 카드의 i를 설정해주고 카드의 순서는 랜덤으로 생성 된다.
            cards.set(randIndex, temp); // 카드는 랜덤 인덱스를 생성하고, 카드의 i를 생성해준다.
            // i index의 카드와 랜덤하게 생성된 randIndex의 카드의 자리를 교환해주면 된다.
        }
    }
    public Deck deal(int count){
        Deck hand = new Deck();
        int size = cards.size();

        for (int i = size -1; i >= size - count; i--){
            hand.addCard(cards.remove(i)); // remove는 카드 인덱스를 제거하는 것과 동시에 원소를 리턴해준다.
        }
        return hand;
    }
}
