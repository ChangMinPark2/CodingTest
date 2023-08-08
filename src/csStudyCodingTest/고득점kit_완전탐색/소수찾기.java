package csStudyCodingTest.고득점kit_완전탐색;

import java.util.ArrayList;

/**
 * 각 종이 조각에 적힌 숫자가 적힌 문자열 numbers
 * 종이 조각으로 만들 수 있는  소수가 몇개인지 ?
 * numbers의 길이는 1이상 7이하.
 * 0~9의 숫자로만 이루어져 있다.
 * "011" -> "11, 101" -> return값 2
 * 011과 11은 같은 숫자로 취급한다.
 * ---------------------------------------------
 * 나의 큰 풀이
 * 1: 모든 경우의 수를 구하는 반복문 작성 붙힐 때는 문자, 소수인지 구할 때는 숫자.
 * 2: 소수를 구할 때 마다 ++;
 * 다른 사람의 풀이
 * DFS, 백 트래킹의 사용법을 몰랐다 보니 당연시하게 DFS 백 트래킹을 사용하는 문제였다.
 * 1. for문을 사용해 각 1부터 ~ numbers의 길이만큼 순열을 만들어 준다.
 * ArrayList를 만들어서 순열을 만드는데 11과 011과 같은 중복되는 수는 중복을 체크하고 리스트에 넣어준다.
 * 리스트에 담긴 모든 값을 소수인지 아닌지 판단한다.
 */
public class 소수찾기 {
    static ArrayList<Integer> arr = new ArrayList<>();
    static boolean[] check = new boolean[7]; //백트래킹을 하려면 무조건 boolean값 있어야함. (visited)

    public static int solution(String numbers) {
        int answer = 0;
        for (int i = 0; i<numbers.length(); i++){
            dfs(numbers, "", i+1);
        }

        for (int i = 0; i<arr.size(); i++){
            if (prime(arr.get(i))) answer++;
        }
        return answer;
    }

    static void dfs(String str, String temp, int m){
        if (temp.length() == m){
            int num = Integer.parseInt(temp);
            if (!arr.contains(num)){
                arr.add(num);
            }
        }

        for (int i = 0; i<str.length(); i++){
            if (!check[i]){
                check[i] = true;
                temp += str.charAt(i);
                dfs(str, temp, m);
                check[i] = false;
                temp = temp.substring(0, temp.length() - 1);
            }
        }
    }

    static boolean prime(int n){
        if (n<2) return false;

        for (int i = 2; i * i <=n; i++){
            if (n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String nums = "17";
        System.out.println(solution(nums));
    }
}
