package programersLV1;

class Solution{
    public int solution(int n) {
        int answer = 0;

        while(true){
            answer++;
            if(n%answer == 1){
                break;
            }
        }

        return answer;
    }
}

public class 나머지가1이되는수찾기 {
    public static void main(String[] args) {
        int n = 12;

        Solution sol = new Solution();
        int result = sol.solution(n);

        System.out.println("결과: "+result);

    }
}
