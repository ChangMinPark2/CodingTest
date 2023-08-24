package csStudyCodingTest.프로그래머스_4장_문자열;

/**
 * 문자열을 공백 문자로 구분하고, 각 단어마다 대,소문자로 변환해야 한다.
 * 문자가 공백일 경우 -> 패스, 다음문자 대문자
 * 공백이 아닐경우 -> 대'소문자 변환하여 이어 붙이기
 * 다음 등장하는 알파벳의 대'소문자는 현재 변환하는 문자와 반대이다.
 */
public class 이상한문자만들기 {
    public String solution(String s) {

        StringBuilder sb = new StringBuilder();
        boolean toUpper = true;

        for (char c : s.toCharArray()){
            if (!Character.isAlphabetic(c)){
                sb.append(c);
                toUpper = true;
            } else {
                if (toUpper){ //true
                    sb.append(Character.toUpperCase(c));
                } else { //fale
                    sb.append(Character.toLowerCase(c));
                }
                toUpper = !toUpper; // true , false 무슨 값이 들어온지 모르기 때문에 !toUpper로 작성. 처음엔 false로 하는 실수가 있었다.
            }
        }
        return sb.toString();
    }
}
