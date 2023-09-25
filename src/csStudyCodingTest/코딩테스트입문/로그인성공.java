package csStudyCodingTest.코딩테스트입문;

public class 로그인성공 {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";

        String identity = id_pw[0];
        String password = id_pw[1];

        for(int i = 0; i < db.length; i++){
            if(db[i][0].equals(identity)){
                if(db[i][1].equals(password)){
                    answer = "login";
                } else answer = "wrong pw";
            }
        }
        return answer;
    }
}
