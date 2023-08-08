package csStudyCodingTest.Level0;


import java.util.ArrayList;
import java.util.List;

public class 카운트다운 {
    public static int[] solution(int start, int end) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for(int i = start; i>=end; i--){
            list.add(i);
        }
        answer = new int[list.size()];

        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
