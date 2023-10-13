package csStudyCodingTest.Level0;

public class 영떼기 {

    public String solution(String n_str) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        if(n_str.charAt(0) != '0'){
            return n_str;
        }

        int count = 0;
        for(int i = 0; i < n_str.length(); i++){
            if(n_str.charAt(i) != '0'){
                break;
            } else count++;
        }

        for(int i = count; i < n_str.length(); i++){
            sb.append(n_str.charAt(i));
        }

        return sb.toString();
    }
}
