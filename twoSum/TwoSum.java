package twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Given an array of integers nums and an integer target,
//return indices of the two numbers such that they add up to target.
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
public class TwoSum {
    public static void main(String[] args) {
        int [] array = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(array, 9)));

    }

//    public static int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] == target - nums [j]){
//                    return new int []{i,j};
//                }
//            }
//        }
//        return nums;
//    }

    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int resultNum = target - nums[i];
            if(map.containsKey(resultNum) && map.get(resultNum) != i){
                return new int[]{i, map.get(resultNum)};
            }
        }

        throw new IllegalArgumentException();
    }
}
