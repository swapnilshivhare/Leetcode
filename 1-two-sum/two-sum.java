class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length < 1) return null; 
        HashMap<Integer, Integer> map = new HashMap<>(); 
        for(int i=0; i<nums.length; i++){
            map.put(target-nums[i], i); 
        }
        for(int i=0; i<nums.length; i++){
           if(map.containsKey(nums[i]) && map.get(nums[i])!=i){
            return new int[]{i, map.get(nums[i]) };
           } 
        }
        return null;
    }
}