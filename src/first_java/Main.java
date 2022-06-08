package first_java;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person("윤빈","이"); // 인스턴스 생성
//        //
//        // Person class에 메소드를 정의하지도 않았는데 왜 수많은 메소드가 있을까?
//        // object 최상위 클래스, 모든 클래스의 부모 클래스.
//        // Object object = new Object();
//
//        System.out.println(person.toString()); // 윤빈 이
//        System.out.println(person); // 윤빈 이


        Deck standardDeck = new Deck();

        for (int suit = 1; suit <= 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                Card newCard = new Card(suit, rank);
                standardDeck.addCard(newCard);
            }
        }

        // 카드 셔플
        standardDeck.shuffle();

        // 딜링
        Deck hand1 = standardDeck.deal(5);
        Deck hand2 = standardDeck.deal(5);

        // 각 핸드 출력
        hand1.print();
        System.out.println("----------");
        hand2.print();


    }
}
