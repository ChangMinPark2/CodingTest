package csStudyCodingTest.Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 문자열내맘대로정렬하기 {

    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        for (int i = 0; i<strings.length; i++){
            list.add(strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(list);

        answer = new String[list.size()];

        for (int i = 0; i < list.size(); i++){
            answer[i] = list.get(i).substring(1, list.get(i).length());
        }

        return answer;
    }
}
