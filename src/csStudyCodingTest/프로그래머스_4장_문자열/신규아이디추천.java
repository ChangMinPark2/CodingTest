package csStudyCodingTest.프로그래머스_4장_문자열;

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
