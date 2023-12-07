package csStudyCodingTest.Level1;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class 소수찾기 {
    public static int solution(int n) {
        int answer = 0;

        boolean[] check = new boolean[n + 1];
        for (int i = 2; i <= n; i++){
            if (check[i] == true) {
                continue;
            }
            for (int j = i + 1; j <= n; j +=i){
                check[j] = true;
            }
        }

        for(int i = 2; i <=n; i++){
            if(!check[i]){
                answer++;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
