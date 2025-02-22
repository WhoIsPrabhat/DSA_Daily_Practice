//https://leetcode.com/problems/number-of-common-factors/

class Solution {
    public int commonFactors(int a, int b) {
        int count=0,t=1;
        while(t<=a && t<=b){
            if(a%t==0 && b%t==0){
                count++;
            
            }
            t++;
        }
        return count;
    }
}