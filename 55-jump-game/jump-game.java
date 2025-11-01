class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // If we can't reach this index
            if (i > maxReach) return false;

            // Update the farthest we can reach
            maxReach = Math.max(maxReach, i + nums[i]);

            // If we can reach or go beyond the last index
            if (maxReach >= n - 1) return true;
        }

        return true; // if loop finishes, last index is reachable
    }
    }
