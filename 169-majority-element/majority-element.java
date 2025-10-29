class Solution {
    public int majorityElement(int[] nums) {
        int index = 0;
        int count = 0;


        for(int i=0;i<nums.length;i++){
            if(count == 0){
                index = nums[i];
            }
            if(index == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return index;
    }
}