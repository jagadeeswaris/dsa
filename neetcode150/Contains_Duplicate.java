// Contains Duplicate

// Given an integer array nums, return true if any value appears more than once in the array, 
// otherwise return false.

// Example 1:
// Input: nums = [1, 2, 3, 3]
// Output: true

// Example 2:
// Input: nums = [1, 2, 3, 4]
// Output: false

import java.util.*;
class Contains_Duplicate{
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 3};
        System.out.println(IsContainDuplicates(nums));
    }

    public static boolean IsContainDuplicates(int[] nums){
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<nums.length;i++){
            if(set.contains(nums[i])){
                return false;
            }
            set.add(nums[i]);
        }
        return true;
    }
}