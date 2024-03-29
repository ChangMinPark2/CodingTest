package csStudyCodingTest.코딩테스트입문;

public class 치킨쿠폰 {
    final int BONUS_NUM = 10;

    public int solution(int chicken) {
        int answer = 0;

        while (chicken >= BONUS_NUM) {
            int newChick = chicken / BONUS_NUM;
            int restChick = chicken % BONUS_NUM;
            chicken = newChick + restChick;

            answer += newChick;
        }

        return answer;
    }
}
