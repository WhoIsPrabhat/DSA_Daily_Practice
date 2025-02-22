//https://leetcode.com/problems/single-number/description/?envType=study-plan-v2&envId=top-100-liked
class Solution {
    public int singleNumber(int[] a) {
         int k=a[0];
        for(int i=1;i<a.length;i++){
            k=k^a[i];
        }
        return k;
    }
}