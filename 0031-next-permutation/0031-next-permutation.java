class Solution {
    private void reverse(int[] nums, int left, int right) {
    while (left < right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;

        left++;
        right--;
    }
}

    public void nextPermutation(int[] nums) {
        //finding pivot
        int len = nums.length;

        int pivot = -1;
        for(int i = len-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }

        //no pivot
        if(pivot == -1){
            reverse(nums, 0, len - 1);
            return;
        }

        //successor and swap
        for(int i = len-1; i > pivot; i--){
            if(nums[i] > nums[pivot]){
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }

    reverse(nums, pivot + 1, len - 1);
    }
}