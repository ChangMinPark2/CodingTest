package csStudyCodingTest.Level0;
import java.lang.reflect.Array;
import java.util.*;

public class 문자열잘라서정렬하기 {

    public static String[] solution(String myString) {

        String[] answer = myString.split("x");
        List<String> list = new ArrayList();
        System.out.println(Arrays.toString(answer));
        for(String str : answer){
            if(!str.isEmpty()){
                list.add(str);
            }
        }

        String[] repo = list.toArray(new String[0]);
        Arrays.sort(repo);

        return repo;
    }

    public static String[] solution2(String myString) {

        String[] answer = myString.split("x");
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("chrxyuixxrex")));
        System.out.println(Arrays.toString(solution2("chrxyuixxrex")));
    }
}
