package csStudyCodingTest.Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 제일작은수제거하기 {
    public static int[] solution(int[] arr) {
        //int[] answer = {};
        if(arr.length == 1) {
            arr[0] = -1;
            return arr;
        }
        int []copy = arr.clone();
        Arrays.sort(copy);
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<copy.length; i++){
            if (arr[i] != copy[0]){
                list.add(arr[i]);
            }
        }
        int[] answer = new int[list.size()]; // 배열의 크기를 지정해주지 않으면 값 넣기 불가능
        for (int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] a = {4, 3, 2, 1};
        System.out.println(Arrays.toString(solution(a)));
    }
}
