class Solution {
    public boolean canJump(int[] nums) {
        int maxreach = 0;
        int last = nums.length;

        for(int i=0;i<last;i++){
            if(i>maxreach){
                return false;
            }
            maxreach = Math.max(maxreach,i+nums[i]);

            if(maxreach>=last-1){
                return true;
            }
        }
        return false;
    }
}