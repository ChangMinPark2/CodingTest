package csStudyCodingTest.프로그래머스_4장_문자열;

/**
 1단계 -> 변수의 대문자를 모두 소문자로 치환한다.
 2단계 -> 숫자, 빼기, 밑줄, 마침표, 소문자를 제외한 나머지 문자를 제거한다.
 3단계 -> 연속적인 . ex) ..., .. -> ., .
 4단계 -> 처음과, 끝에 .이 있다면 제거합니다.
 5단계 -> 빈 문자열이라면 a를 대입합니다.
 6단계 -> 아이디의 길이가 16자 이상이라면, 처음 15자를 제외한 나머지 문자는 제거합니다.
 7단계 -> 변수의 길이가 <= 2라면, 마지막 문자를 3이상이 될 때 까지 추가합니다.
 **/

public class 신규아이디추천 {
    public String solution(String new_id) {
        //1단계
        new_id = new_id.toLowerCase();

        //2단계 책에서는 -_. 전에 \\ 을 붙힘. 이유는 모르겠다.
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");

        //3단계 ("[.]{2,}", ".") -> .이 2개 이상이라면 .으로 바꾼다.
        new_id = new_id.replaceAll("\\.+", ".");

        //4단계 (^[.]|[.]$","");
        new_id = new_id.replaceAll("^\\.+|\\.+$", "");

        //5단계
        if(new_id.isEmpty()) new_id = "a";

        //6단계 ("^[.]|[.]$","") 가능
        if(new_id.length() > 15){
            new_id =new_id.substring(0, 15);
            new_id = new_id.replaceAll("\\.+$", "");
        }

        //7단계
        while (new_id.length() < 3){
            new_id += new_id.charAt(new_id.length() - 1);
        }

        return new_id;
    }

    public static void main(String[] args) {

    }

}
