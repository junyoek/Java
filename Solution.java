package programersLV1;

public class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;

        while (true) {
            int max_wallet = (wallet[0] > wallet[1]) ? wallet[0] : wallet[1];
            int min_wallet = (wallet[0] < wallet[1]) ? wallet[0] : wallet[1];
            int max_bill = (bill[0] > bill[1]) ? bill[0] : bill[1];
            int min_bill = (bill[0] < bill[1]) ? bill[0] : bill[1];

            if ((min_bill > min_wallet) || (max_bill > max_wallet)) {
                if (bill[0] > bill[1]) {
                    bill[0] = bill[0] / 2;
                }else{
                    bill[1] = bill[1]/2;
                }
                answer++;
            }else{
                break;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        int[] w = {50,50};
        int[] b = {100,241};

        Solution solution = new Solution();

        int result = solution.solution(w,b);

        System.out.println(result);


    }
}
