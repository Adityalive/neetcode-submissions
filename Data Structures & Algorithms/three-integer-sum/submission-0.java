
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        // 1. Change type to List<List<Integer>> and name it 'res'
        List<List<Integer>> res = new ArrayList<>(); 
        
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum > 0) {
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    // 2. Now 'res' matches the name above
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    
                    // Skip duplicates for the left pointer
                    while (nums[l] == nums[l - 1] && l < r) {
                        l++;
                    }
                }
            }
        }
        // 3. Move the return OUTSIDE the for-loop
        return res; 
    }
}