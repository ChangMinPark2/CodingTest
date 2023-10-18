package csStudyCodingTest.Level0;
import java.util.*;

public class 문자열잘라서정렬하기 {

    public String[] solution(String myString) {

        String[] answer = myString.split("x");
        List<String> list = new ArrayList();

        for(String str : answer){
            if(!str.isEmpty()){
                list.add(str);
            }
        }

        String[] repo = list.toArray(new String[0]);
        Arrays.sort(repo);

        return repo;
    }
}
