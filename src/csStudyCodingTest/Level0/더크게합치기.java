package csStudyCodingTest.Level0;

public class 더크게합치기 {
    public int solution(int a, int b) {
        int answer = 0;
        String as = String.valueOf(a) + String.valueOf(b);
        String bs = String.valueOf(b) + String.valueOf(a);
        if (Integer.parseInt(as) > Integer.parseInt(bs)) answer = Integer.parseInt(as);
        else answer = Integer.parseInt(bs);
        return answer;
    }
}
