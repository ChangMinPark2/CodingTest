package csStudyCodingTest.Level0;
/*
* char 형태의 아스키코드를 알기
* */
public class 문자개수세기 {

    public int[] solution(String my_string) {
        int[] answer = new int[52];


        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                answer[c - 'A']++;
            } else if (c >= 'a' && c <= 'z') {
                answer[26 + c - 'a']++;
            }
        }

        return answer;
    }
}
