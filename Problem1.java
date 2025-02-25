// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//80. Remove Duplicates from Sorted Array II

public class Problem1 {
public int removeDuplicates(int[] nums) {
    int n = nums.length;
    int slow = 1;
    int count = 1;
    
    for(int fast=1; fast<n; fast++){
        if(nums[fast] == nums[fast-1]){
             count++;
        }else {
            count = 1;
        }
    
        if(count<=2){
           nums[slow] = nums[fast];
           slow++;
        }
    }
    
    return slow;
    
}
}
