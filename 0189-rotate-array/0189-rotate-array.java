class Solution {
    public void initial_rotate(int[] arr, int s, int e){
        while( s <= e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        initial_rotate(nums,0,n-1);
        initial_rotate(nums,0,k-1);
        initial_rotate(nums,k,n-1);
    }
}