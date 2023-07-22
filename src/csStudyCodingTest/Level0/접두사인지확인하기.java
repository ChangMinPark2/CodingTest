package csStudyCodingTest.Level0;

public class 접두사인지확인하기 {
    public static int solution(String my_string, String is_prefix) {
        int answer = 0;
        String[]a = new String[my_string.length()];

        for (int i = 0; i<my_string.length(); i++){
            a[i] = my_string.substring(0, i);
        }
        for (int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
        for (int i = 0; i<a.length; i++){
            if (a[i].equals(is_prefix)){
                answer = 1; break;
            }
            else answer = 0;
        }
        return answer;
    }

}
