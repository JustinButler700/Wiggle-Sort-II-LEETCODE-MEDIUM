//Justin Butler
// 11/6/2021
class Solution {
    public void wiggleSort(int[] nums) {
        int[] copy = nums.clone();
        Arrays.sort(copy);
        int offset = 1;
        for(int i = 1; i < nums.length; i+=2)
        {
            nums[i] = copy[copy.length-offset];
            offset++;
        }
        for(int i = 0; i < nums.length; i+=2)
        {
            nums[i] = copy[copy.length-offset];
            offset++;
        }
        
    }
}
