package csStudyCodingTest.Level0;

public class 문자열이몇번등장하는지세기 {
    public int solution(String myString, String pat) {
        int answer = 0;
        for(int i = 0; i <= myString.length() - pat.length(); i++){
            if(myString.substring(i, pat.length() + i).equals(pat)){
                answer++;
            }
        }
        return answer;
    }
}
