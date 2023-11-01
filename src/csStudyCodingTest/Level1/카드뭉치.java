package csStudyCodingTest.Level1;

/**
 cards1 의 인덱스, cards2의 인덱스의 변수를 따로.

 **/
public class 카드뭉치 {

    public static String solution(String[] cards1, String[] cards2, String[] goal) {

        int sum = 0;
        int oneIdx = 0;
        int twoIdx = 0;

        for (int i = 0; i < goal.length; i++){
            if(oneIdx < cards1.length && goal[i].equals(cards1[oneIdx])){
                oneIdx++;
                sum ++;
            }
            if(twoIdx < cards2.length && goal[i].equals(cards2[twoIdx])){
                twoIdx++;
                sum++;
            }
        }

        System.out.println(sum);

        return sum == goal.length ? "Yes" : "No";
    }

    public static void main(String[] args) {
        String[] card1 = {"i", "drink", "water"};
        String[] card2 = {"want", "to"};
        String[] card3 = {"i", "want", "to", "drink", "water"};

        System.out.println(solution(card1, card2, card3));

    }
}
