package csStudyCodingTest.코딩테스트입문;

/**
 1. dic for문을 돌린다.
 2. boolean 확인용 변수하나 선언해주고
 2. dic[i]에 spell이 포함되어 있지 않으면 false, 크기가 달라고 false
 **/

public class 외계어사전 {

    public int solution(String[] spell, String[] dic) {

        int answer = 2;

        for (int i = 0; i < dic.length; i++){

            boolean check = false;

            if(spell.length == dic[i].length()){
                check = true;

                for(int j = 0; j < spell.length; j++){
                    if(!dic[i].contains(spell[j])){
                        check = false;
                        break;
                    }
                }
                if(check) answer = 1;
            }
        }

        return answer;
    }
    public static void main(String[] args) {

    }
}
