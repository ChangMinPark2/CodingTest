package csStudyCodingTest;

import java.lang.reflect.Array;
import java.util.Arrays;

//자연수로 이루어진 두 배열
//A, B 숫자를 뽑아 곱하기
//누적해서 더한 값이 최솟값으로 만들기
//배열 한 쪽은 최댓 값이고, 다른 한 쪽은 최솟 값을 곱해주는 것이 최종적으로 최솟 값을 만들 수 있음. -> 핵심 포인트
public class 최솟값만들기 {
    public static int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A); //A를 오름차순으로 정렬해라.
        Arrays.sort(B); //B를 오름차순으로 정렬해라.

        for(int i=0; i<A.length; i++){
            answer += A[i] * B[A.length -i -1];
        }
        return answer;
    }

    public static void main(String[] args) {
        int []A = {1, 4, 2};
        int []B = {5, 4, 4};
        System.out.println(solution(A,B));
    }
}
