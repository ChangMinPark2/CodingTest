package csStudyCodingTest.Level0;
import java.util.*;

public class 접미사배열 {

    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];

        for(int i = 0; i < answer.length; i++){
            answer[i] = my_string.substring(i, answer.length);
        }

        Arrays.sort(answer);

        return answer;
    }
}
