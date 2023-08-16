package csStudyCodingTest.Level0;

public class 문자열바꿔서찾기 {
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<pat.length(); i++){
            if (pat.charAt(i) == 'A'){
                sb.append('B');
            } else sb.append('A');
        }

        if (myString.contains(sb)){
            answer = 1;
        }
        return answer;
    }
}
