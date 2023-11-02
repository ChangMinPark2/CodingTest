package csStudyCodingTest.Level1;

/**
 eleven의 인덱스 + 1 이 a일때,
 date =
 **/
public class 이천십육년 {

    public String solution(int a, int b) {
        String answer = "";
        String[] seven = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] eleven = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int date = 0;

        //1~ 남은 월까지
        for(int i = 0; i < a - 1; i++){
            date += eleven[i];
        }

        //시작이 1이므로 해당 달에 일 수 더하기
        date += b - 1;

        return seven[date % 7];
    }
}
