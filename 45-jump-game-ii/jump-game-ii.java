class Solution {
    public int jump(int[] nums) {
        int totaljump = 0;
        int fast = 0;
        int last = 0;

        if(nums.length<=1){
            return 0;
        }

        for(int i=0;i<nums.length-1;i++){
            fast = Math.max(fast,i+nums[i]);

            if(i == last ){
                totaljump++;
                last = fast;
            }
        }
        return totaljump;
    }
}