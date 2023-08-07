package csStudyCodingTest.Level0;

public class 문자리스트를문자열로반환하기 {
    public String solution(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for (String s : arr){
            sb.append(s);
        }
        return sb.toString();
    }
}
