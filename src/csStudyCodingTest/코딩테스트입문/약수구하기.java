package csStudyCodingTest.코딩테스트입문;

import java.util.ArrayList;
import java.util.List;

public class 약수구하기 {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            if(n % i == 0) list.add(i);
        }
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
