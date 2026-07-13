class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int p=0;
        int p1=0;
        int maxCons=0;
        while(p!=nums.length){
            if(nums[p]!=1 && p==p1){
                p++;
                p1++;
            }else if(nums[p]!=1 && p!=p1){
                maxCons=Math.max(maxCons,p-p1);
                p1=p;
            }else{
                p++;
            }
        }
        maxCons = Math.max(maxCons, p - p1);
        return maxCons;
    }
}