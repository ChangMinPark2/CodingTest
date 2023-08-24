package csStudyCodingTest.프로그래머스_4장_문자열;

/***
 * 문제 풀이 흐름
 * 1. 입력 문자열이 모든 문자에 대해 반복
 * 2. 알파벳이 아닌 경우 문자를 그대로 이어 붙이기
 * 3. 알파엣인 경우 n만큼 밀어 이어 붙이기
 */
public class 시저암호 {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()){
            sb.append(push(c, n));
        }
        return sb.toString();
    }

    private char push(char c, int n){
        int offset = Character.isUpperCase(c) ? 'A' : 'a'; //대문자인지 소문자인지
        int position = c - offset; // c -> 'a';
        //TODO : 여기 다시 풀어보기
        position = (position + n) % ('Z' - 'A' + 1); // 알파벳이 넘어가면 안되기 때문에
        return (char) (offset + position);
    }

    public static void main(String[] args) {
        int a = 'Z' - 'A';
        System.out.println(a);
    }
}



