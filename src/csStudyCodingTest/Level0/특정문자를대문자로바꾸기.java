package csStudyCodingTest.Level0;

public class 특정문자를대문자로바꾸기 {
    public String solution(String my_string, String alp) {
        String answer = "";

        StringBuilder sb = new StringBuilder();

        answer = my_string.replaceAll(alp, alp.toUpperCase());
        for (int i = 0; i<my_string.length(); i++){
            if (my_string.charAt(i) == alp.charAt(0)){
                sb.append(Character.toUpperCase(alp.charAt(0)));
            }else {
                sb.append(my_string.charAt(i));

            }
        }
        return sb.toString();
    }
}
