package csStudyCodingTest.Level0;
import java.util.*;

public class 수열과구간쿼리투 {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            int min = Integer.MAX_VALUE;
            for(int j = s; j <= e; j++){
                if(arr[j] > k && arr[j] < min){
                    min = arr[j];
                }
                answer[i] = min == Integer.MAX_VALUE ? -1 : min;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] arrr = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
        List<String> list = new ArrayList<>();
        list.add(" O] \n[ 1");
        System.out.println(list);

    }
}
