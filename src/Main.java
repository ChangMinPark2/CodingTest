/*
1:1
매 대결마다 음식, 양 다름
일렬로 배치
1번 왼쪽 -> 오른쪽
2번 오른쪽 -> 왼
중앙 물 배치 먼저 먹는 사람 승리
*/
class Solution {
    public static String solution(int[] food) {
        String result = "";

        for(int i=1; i<food.length; i++){
            int num = (int)food[i]/2;
            for(int j=0; j<num; j++){
                result += i+"";
            }
        }

        int l = result.length();
        String answer = "";
        for(int i=l-1; i>=0; i++){
            answer += result.charAt(i) + "";
        }

        return result + "0" + answer;
    }

    public static void main(String[] args) {
        int[] t = new int[]{1, 3, 4, 6};
        System.out.println(solution(t));
    }
}