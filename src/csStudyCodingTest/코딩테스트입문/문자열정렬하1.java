package csStudyCodingTest.코딩테스트입문;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 문자열정렬하1 {
    public List solution(String my_string) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i<my_string.length(); i++){
            if (Character.isDigit(my_string.charAt(i))){
                list.add((int)my_string.charAt(i) - 48);
            }
        }
        Collections.sort(list);
        return list;
    }

}
