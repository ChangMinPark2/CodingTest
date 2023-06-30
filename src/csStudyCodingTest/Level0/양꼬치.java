package csStudyCodingTest.Level0;

/***
 * 양꼬치 n, 음료수 k
 * 양꼬치 10개당 음료수 1개 꽁짜
 */
public class 양꼬치 {
    public static int solution(int n, int k) {
        int answer = 0;
        int a = n/10;

        k -=a;

        answer = 12000 * n + k * 2000;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(64, 6));
    }
}
