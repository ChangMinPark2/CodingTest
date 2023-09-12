package csStudyCodingTest.코딩테스트입문;

import java.util.*;
public class 에이로비만들기 {
    public int solution(String before, String after) {
        int answer = 1;

        char[] a = before.toCharArray();
        char[] b = after.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        for(int i = 0; i < a.length; i++){
            if(a[i] != b[i]){
                answer = 0;
            }
        }
        return answer;
    }
}
