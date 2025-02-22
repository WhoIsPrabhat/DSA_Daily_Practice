//https://leetcode.com/problems/two-sum/description/?envType=study-plan-v2&envId=top-100-liked

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[]=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
           int temp=target-nums[i];
           if(map.containsKey(temp)){
               a[0]=map.get(temp);
               a[1]=i;
               break;
           }
           else{
               map.put(nums[i],i);
           }
       }
        return a;
    }
}