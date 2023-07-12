package csStudyCodingTest.Level0;

public class 문자열안에문자열 {
    public int solution(String str1, String str2) {

        if (str1.contains(str2)){
            return 1;
        }
        return 2;
    }

}
