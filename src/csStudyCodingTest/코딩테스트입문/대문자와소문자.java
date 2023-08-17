package csStudyCodingTest.코딩테스트입문;

public class 대문자와소문자 {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < my_string.length(); i++){
            if(Character.isLowerCase(my_string.charAt(i))){
                sb.append(Character.toUpperCase(my_string.charAt(i)));
            } else sb.append(Character.toLowerCase(my_string.charAt(i)));
        }
        return sb.toString();
    }
}
