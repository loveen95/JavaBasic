package Inheritance;

public class BlackjackCard extends Card{
    // commend + N = 생성자 생성 단축키
    public BlackjackCard(int suitNumber, int rankNumber) {
        // 부모인 Card class를 상속 받고 그대로 파라미터도 상속 받는다.
        super(suitNumber, rankNumber);
    }
    public int getValue() {
        // Rank를 기준
        // Ace(1)은 11을 리턴
        // J, Q, K(11-13)은 10을 리턴
        switch (rankNumber){
            case 1:
                return 11;
            case 11:  // 같은 값을 리턴할때에는 이 형식을 사용
            case 12:
            case 13:
                return 10;
            default:
                return rankNumber;
        }
    }
    public boolean isAce() {;
        return rankNumber == 1;

        }
    }


