package csStudyCodingTest.Level0;

import java.util.*;

/**
 4개의 숫자가 같다면 숫자 * 1111;
 3개의 숫자 같음 P, 나머지 Q (10 * p + q) 제곱
 2개씩 같다 P, Q p+q * |p-q|
 2개가 같고 2개가 다르면 다른 숫자 Q * R;
 모두 다르다면 가장 작은 숫자 만큼 점수를 얻는다.
 **/

public class 주사위게임삼 {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        Arrays.sort(dice);

        if (dice[0] == dice[3]) {
            return a * 1111;
        } else if (dice[0] == dice[2] || dice[1] == dice[3]) {
            return (int) Math.pow(dice[1] * 10 + (dice[0] + dice[3] - dice[1]), 2);
        } else if (dice[0] == dice[1] && dice[2] == dice[3]) {
            return (dice[0] + dice[2]) * Math.abs(dice[2] - dice[0]);
        } else if (dice[0] == dice[1]) {
            return dice[2] * dice[3];
        } else if (dice[1] == dice[2]) {
            return dice[0] * dice[3];
        } else if (dice[2] == dice[3]) {
            return dice[0] * dice[1];
        } else return dice[0];
    }
}
