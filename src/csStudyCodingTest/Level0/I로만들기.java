package csStudyCodingTest.Level0;

public class I로만들기 {
    public String solution(String myString) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < myString.length(); i++){
            if (myString.charAt(i) < 'i'){
                sb.append('i');
            }else sb.append(myString.charAt(i));
        }

        return answer;
    }
}
