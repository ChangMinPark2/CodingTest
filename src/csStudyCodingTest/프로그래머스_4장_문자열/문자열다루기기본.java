package csStudyCodingTest.프로그래머스_4장_문자열;

/**
 문자열의 길이가 4, 6이 아니라면 false;
 숫자가 아니라면 false;
 **/
public class 문자열다루기기본 {

    public boolean solution(String s) {
        boolean answer = true;

        if(s.length() != 4 && s.length() !=6){
            return false;
        }

        for(char c : s.toCharArray()){
            if(!Character.isDigit(c))
                return false;
        }

        return answer;
    }
}
