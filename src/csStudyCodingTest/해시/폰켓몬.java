package csStudyCodingTest.해시;

import java.util.HashMap;

/**
 * N마리 포켓몬 중에서 n/2마리 포켓몬을 가져도 된다.
 * 포켓몬 종류에 따라 번호를 붙여 구분하고, 같은 종류의 포켓몬은 같은 번호를 가지고 있다.
 * nums -> N마리의 포켓몬 종류 번호가 담긴 배열
 * 가장 많은 종류의 포켓몬을 선택하는 방법을 찾아서 포켓몬 종류의 개수를 return하기.
 * */
public class 폰켓몬 {
    public static int solution(int[] nums) {
        int answer = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer i : nums){
            map.put(i, 0);
        }

        if (nums.length/2 > map.size()){
            answer += map.size();
        } else answer+= nums.length/2;

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 2, 2, 2};
        System.out.print(solution(nums));
    }
}
