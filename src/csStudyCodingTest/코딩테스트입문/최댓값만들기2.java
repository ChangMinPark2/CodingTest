package csStudyCodingTest.코딩테스트입문;

import java.util.Arrays;

public class 최댓값만들기2 {
    public static int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);

        answer = numbers[0] * numbers[1] > numbers[numbers.length - 1] * numbers[numbers.length - 2] ?
                numbers[0] * numbers[1] : numbers[numbers.length - 1] * numbers[numbers.length - 2];
        return answer;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, -5};
        System.out.println(solution(a));
    }

}
