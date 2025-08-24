package Two_Pointers.ThreeSum;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums){
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++){
            int left = 1;
            int right = nums.length-1;

            while (left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return new ArrayList<>(res);
    }
}
