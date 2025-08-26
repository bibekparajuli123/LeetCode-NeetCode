package Arrays_and_Hashing.Two_Sum;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int container = target - nums[i];

            if(map.containsKey(container)){
                return new int[]{map.get(container), i};
            }

            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
