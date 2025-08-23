package Arrays_and_Hashing.Contains_Duplicate;

public class BruteForceApproach {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        BruteForceApproach brt = new BruteForceApproach();
        int[] nums = {1,2,3,3,4,5,6,7};

        System.out.println(brt.hasDuplicate(nums));
    }
}
