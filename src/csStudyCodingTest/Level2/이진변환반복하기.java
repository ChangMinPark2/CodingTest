package csStudyCodingTest.Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* 0과 1로 이루어진 문자열 s
*  이빈 변환, 0의 개수 증가한 배열 리턴
* */
public class 이진변환반복하기 {
    public static int[] solution(String s) {
        int[] answer = new int[2];
        while (s.length()>1){
            answer[0]++;
            List<Integer>list = new ArrayList<>();
            for (int i=0; i<s.length(); i++){
                if (s.charAt(i) == '1'){
                    list.add(1);
                } else answer[1]++;
            }
            s = Integer.toBinaryString(list.size());
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("110010101001")));
    }
}
