package csStudyCodingTest.Level0;

public class 글자이어문자열만들기 {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        while (true){
            for (int i = 0; i<index_list.length; i++){
                sb.append(my_string.charAt(index_list[i]));
            }
            break;
        }
        return sb.toString();
    }
}
