package programersLV1;

public class 문자열을정수로바꾸기 {
    public static void main(String[] args) {
        String str = "-1234";

        Solution s = new Solution();
        int result = s.solution(str);

        System.out.println("결과: "+result);
    }
}
class Solution{
    public int solution(String s) {
        int answer = 0;
        char ch = s.charAt(0);

        int startIndex = (ch == '-')? 1:0;

        for (int i = startIndex; i < s.length(); i++) {
            ch = s.charAt(i);
            int digit = ch - '0';

            answer = answer*10 + digit;
        }

        if(startIndex == 1){
            answer = answer*-1;
        }

        return answer;
    }
}
