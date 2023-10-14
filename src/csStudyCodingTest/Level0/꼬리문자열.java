package csStudyCodingTest.Level0;

/**
 str배열의 인덱스 순서대로 넣는데, ex가 있는 인덱스는 제외시키고 넣는다.
 **/
public class 꼬리문자열 {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for(int i = 0; i < str_list.length; i++){
            if(!str_list[i].contains(ex)){
                answer += str_list[i];
            }
        }
        return answer;
    }
}
