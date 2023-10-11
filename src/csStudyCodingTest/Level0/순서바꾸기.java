package csStudyCodingTest.Level0;

/**
 나의 풀이
 list 선언
 while문을 돌려서, n부터 add 이후 n이 num_list와 같으면 n = 0;
 list.size가 num_list와 같으면 break;

 나의 풀이 2
 answer[i] = n[i + n] 으로 하고,
 i + n < numlist.length 라면, i + n % numlist.lengh
 **/

public class 순서바꾸기 {

    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];

        for(int i = 0; i < answer.length; i++){
            answer[i] = num_list[(i + n) % num_list.length];
        }

        return answer;
    }
}
