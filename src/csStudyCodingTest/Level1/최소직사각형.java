package csStudyCodingTest.Level1;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class 최소직사각형 {
    public static int solution(int[][] sizes) {
        int answer = 0;
        int max_h = 0;
        int min_v = 0;

        for (int i = 0; i< sizes.length; i++){
            int max = Math.max(sizes[i][0], sizes[i][1]);
            int min = Math.min(sizes[i][0], sizes[i][1]);
            max_h = Math.max(max_h, max);
            min_v = Math.max(min_v, min);

        }
        answer = max_h * min_v;
        return answer;
    }

    public static void main(String[] args) {
        int[][] a = {{60, 50}, {30, 70}, {60, 30}, {80,40}};
        for (int i = 0; i< a.length; i++){
            for (int j=0; j<2; j++){
                System.out.println(a[i][j]);
            }
        }
    }
}
