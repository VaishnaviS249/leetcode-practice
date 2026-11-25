class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> arr=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(arr.contains(nums[i])){
                return nums[i];
            }
            arr.add(nums[i]);
        }
        return -1;
    }
}