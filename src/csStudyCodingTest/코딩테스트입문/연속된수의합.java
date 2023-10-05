package csStudyCodingTest.코딩테스트입문;

public class 연속된수의합 {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        int start = (total/num) - ((num - 1)/2);

        for(int i = 0; i < num; i++) {
            answer[i] = start;
            start++;
        }

        return answer;
    }
}
