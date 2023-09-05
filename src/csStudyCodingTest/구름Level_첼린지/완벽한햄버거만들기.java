package csStudyCodingTest.구름Level_첼린지;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.*;

/**
 * 첫 번째 입력 값 재료의 개수 N
 * 두 번째 입력 값 햄버거를 만들 때 쓴 재료의 맛의 정도 공백
 * 조건 -> 가장 높은 재료를 기준으로 위랑 아래로 갈 수록 재료의 맛의 정도가 감소하거나 같아야 한다.
 *
 */
public class 완벽한햄버거만들기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String input2 = br.readLine();

        String[] str = input2.split(" ");

        int[] arr = new int[str.length];

        for (int i = 0; i < str.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }

        int maxIndex = 0;
        int result = 0;

        for (int i = 1; i < arr.length; i++){
            if (arr[i] > arr[maxIndex] ){
                maxIndex = i;
            }
        }
        // 배열 -> 최댓값 인덱스 구하기

        // 0 ~ 맥스 사이에 인덱스가 있을때 / i번 째 인덱스 / 는 i - 1 / 보다 항상 커야한다
        for (int i = 1; i < maxIndex; i++) {
            if (arr[i] < arr[i-1]){
                System.out.println(0);
                return;
            }
        }

        // 맥스인덱스 ~ 마지막 인덱스까지 있을 때 / i번째 인덱스의 값은 / i+1의 값보다 / 보다 항상 작거나 같아야한다.
        for (int i = maxIndex; i < arr.length - 1; i++){
            if (arr[i] < arr[i + 1]){
                System.out.println(0);
                return;
            }
        }

        System.out.println(Arrays.stream(arr).sum());

    }


}
