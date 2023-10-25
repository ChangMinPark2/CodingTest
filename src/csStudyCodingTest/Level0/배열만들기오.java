package csStudyCodingTest.Level0;
import java.util.*;

public class 배열만들기오 {
    public int[] solution(String[] intStrs, int k, int s, int l) {

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < intStrs.length; i++){
            int a = Integer.valueOf(intStrs[i].substring(s, s + l));
            if(a > k){
                list.add(a);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
