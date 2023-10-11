package csStudyCodingTest.Level0;

/**
 새로운 배열 선언
 substring을 이용해서 접미사를 다 저장하고, is랑 같은지 비교후 1 or 0 리턴
 **/
public class 접미사인지확인하기 {

    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String[] str = new String[my_string.length()];

        for(int i = 0; i < str.length; i++){
            str[i] = my_string.substring(i);

            if(str[i].equals(is_suffix)){
                answer++;
            }
        }

        return answer;
    }
}
