package csStudyCodingTest.코딩테스트입문;

import java.util.*;


public class 소인수분해 {
    public int[] solution(int n) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();

        for(int i = 2; i <= n; i++){
            if(isHow(i)){
                list.add(i);
            }
        }

        answer = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return answer;
    }

    private boolean isHow(int n){
        int count = 0;

        for(int i = 2; i <=n; i++){
            if(n % i == 0) count ++;
        }

        if(count > 1) return false;
        else return true;
    }
}
