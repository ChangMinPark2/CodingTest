package csStudyCodingTest.Level0;
import java.util.*;

public class 왼쪽오른쪽 {
    public String[] solution(String[] str_list) {
        String[] answer = {};

        for(int i = 0; i < str_list.length; i++){
            if(str_list[i].equals("l")){
                return Arrays.copyOfRange(str_list, 0, i);
            } else if (str_list[i].equals("r")) {
                return Arrays.copyOfRange(str_list, i + 1, str_list.length);
            }
        }
        return answer;
    }
}
