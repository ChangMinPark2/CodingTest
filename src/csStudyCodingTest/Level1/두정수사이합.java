package csStudyCodingTest.Level1;

import java.util.Arrays;

// a=3, b=5 -> 3 + 4 + 5
// a=3, b=3 -> 3 + 3 = 6
// a=5, b=3 -> 5 + 4 + 3
public class 두정수사이합 {
    public static long solution(int a, int b) {
        long answer = 0;

        if (a < b){
            for (int i = a; i<=b; i++){
                answer +=i;
            }
        } else {
            for (int i=b; i<=a; i++){
                answer +=i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 3));
    }
}
