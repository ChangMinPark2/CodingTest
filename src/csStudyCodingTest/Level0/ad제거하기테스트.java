package csStudyCodingTest.Level0;

import java.util.*;

public class ad제거하기테스트 {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();

        for(String str: strArr){
            if(!str.contains("ad")){
                list.add(str);
            }
        }

        return list.toArray(new String[0]);
    }
}
