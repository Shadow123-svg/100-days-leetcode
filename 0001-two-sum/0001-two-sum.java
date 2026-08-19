import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans[]=new int[2];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {

                int j = map.get(complement);

                if (i != j) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}