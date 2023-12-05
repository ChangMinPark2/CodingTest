package csStudyCodingTest.Level0;

public class 코드처리하기 {
    public String solution(String code) {
        String answer = "";
        int mode = 0;

        for(int i = 0; i < code.length(); i++){
            if(mode == 0 && i % 2 == 0 && code.charAt(i) != '1'){
                answer += code.charAt(i);
            } else if(mode == 1 && i % 2 == 1 && code.charAt(i) != '1'){
                answer += code.charAt(i);
            } else if(code.charAt(i) == '1'){
                if(mode == 0){
                    mode = 1;
                } else if(mode == 1){
                    mode = 0;
                }
            }
        }

        if(answer.isEmpty()){
            return "EMPTY";
        }
        return answer;
    }
}
