package Arrays_and_Hashing.Contains_Duplicate;

public class Optimal {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true; // duplicate found
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6};
        Optimal op = new Optimal();
        op.hasDuplicate(nums);
    }
}
