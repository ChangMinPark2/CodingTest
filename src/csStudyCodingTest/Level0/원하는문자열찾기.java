package csStudyCodingTest.Level0;

public class 원하는문자열찾기 {
    public int solution(String myString, String pat) {
        int answer = 0;
        String myStrings = myString.toUpperCase();
        String pats = pat.toUpperCase();
        if (myStrings.contains(pats)){
            answer = 1;
        }
        return answer;
    }
}
