package csStudyCodingTest.Level0;

import java.util.*;
public class 공백으로구분하기2 {
    public String[] solution(String my_string) {
        String[] answer = my_string.trim().split("\\s+");
        return answer;
    }
}
