package csStudyCodingTest.Level0;

import java.util.ArrayList;
import java.util.List;

/**
 * 5명씩 맨앞사람 이름 리턴
 * */
public class 오명씩 {
    public String[] solution(String[] names) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        for(int i = 0; i < names.length; i+=5){
            list.add(names[i]);
        }

        answer = new String[list.size()];

        for (int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
