//https://leetcode.com/problems/sort-colors/description/?envType=study-plan-v2&envId=top-100-liked
class Solution {
    public void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public void sortColors(int[] nums) {
        int i=0,j=0,k=nums.length-1;
        while(i<=k){
            if(nums[i]==0){
                swap(nums,i,j);
                i++;
                j++;
            }
            else if(nums[i]==1){
                i++;
            }
            else{
                swap(nums,i,k);
                k--;
            }
        }
        
    }
}