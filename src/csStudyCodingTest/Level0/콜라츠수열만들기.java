package csStudyCodingTest.Level0;

/**
 1. list로 n을 넣고,
 **/
import java.util.*;
public class 콜라츠수열만들기 {

    public int[] solution(int n) {

        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        list.add(n);

        while(n != 1){
            if(n % 2 == 0){
                n = n / 2;
            } else if(n % 2 == 1){
                n = n * 3 + 1;
            }

            list.add(n);
        }

        answer = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return answer;
    }
}
