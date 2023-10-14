package csStudyCodingTest.Level0;

// todo_list와 finished의 길이는 같다.
// finished의 인덱스가 false라면, todo_list의 인덱스의 접근해서 리스트에 넣는다.

import java.util.*;
public class 할일목록 {

    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        List<String> list = new ArrayList<>();

        for(int i = 0; i < todo_list.length; i++){
            if(!finished[i]){
                list.add(todo_list[i]);
            }
        }

        answer = list.toArray(new String[list.size()]);

        return answer;
    }
}
