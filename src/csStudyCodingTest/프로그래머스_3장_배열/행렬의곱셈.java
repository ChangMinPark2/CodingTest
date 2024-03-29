package csStudyCodingTest.프로그래머스_3장_배열;

import java.util.Arrays;

/**
 * 행렬의 곱셈의 경우 왼쪽 행렬의 행과 오른쪽 행렬의 열이 크기가 같으면 가능하다.
 */
public class 행렬의곱셈 {
    public int[][] solution(int[][] arr1, int[][] arr2) {

        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[0].length; j++){
                for (int k = 0; k < arr1[i].length; k++){
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};

        int[][] arr2 = {{3, 3}, {3, 3}};
        arr1[0][0] = 0;

        System.out.println(Arrays.deepToString(arr1));
    }
}
