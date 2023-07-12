package csStudyCodingTest.Level0;

import java.util.ArrayList;
import java.util.List;

public class 짝수는싫어요 {
    public static List<Integer> solution(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i<=n; i++){
            if (i%2==1) list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(solution(15));
    }
}
