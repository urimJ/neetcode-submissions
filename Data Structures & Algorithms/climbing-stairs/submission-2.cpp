class Solution {
public:
    int climbStairs(int n) {
        /*
        n=1, 1
        n=2, 2
        n=3, 3 n2+n1
        n=4, 1+1+1+1, 1+2+1 =>3, 2+2 5 n3+n2
        n=5, 1+1+1+1+1, 1+2+1+1 =>4, 2+2+1=>3 8 n4+n3
        */

        int dp[31];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        
        for(int i=3; i<=30; i++)
        {
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
};
