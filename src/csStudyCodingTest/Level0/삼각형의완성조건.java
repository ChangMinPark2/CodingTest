package csStudyCodingTest.Level0;

import javax.lang.model.type.ArrayType;
import java.util.Arrays;

public class 삼각형의완성조건 {
    public static int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);

        if (sides[0] + sides[1] <= sides[2])
            answer = 2;
        else answer = 1;
        return answer;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};

        System.out.println(solution(a));
    }
}
