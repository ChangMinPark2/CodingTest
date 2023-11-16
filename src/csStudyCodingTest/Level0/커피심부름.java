package csStudyCodingTest.Level0;
//아메리카노 , 라테 각각 4500, 5000
//메뉴만 적은 것은 차가운 것
//아무거나를 적은 팀원의 것은 차가운 아메리카노
public class 커피심부름 {

    public int solution(String[] order) {
        int answer = 0;

        for(String str : order){
            if(str.contains("cafelatte")) answer += 5000;
            else answer+= 4500;
        }
        return answer;
    }
}
