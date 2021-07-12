package leetcode;

public class a31_search {
    public int search(int[] nums, int target){
        int n = nums.length;
        if(n == 0)
            return -1;

        if(n == 1)
            return nums[0] == target ? 0 : -1;

        int l = 0, r = n -1;
        while(l <= r){
            int mid = (l + r)/2;
            if(nums[mid] == target)
                return mid;
            if(nums[0] <= nums[mid]){
                if(nums[0] <= target && target <= nums[mid]){ // l <= target <= mid
                    r = mid - 1;
                } else{
                    l = mid + 1;
                }
            } else if(nums[0] > nums[mid]){
                if(nums[mid] <= target && target <= nums[n-1]){
                    l = mid + 1;
                }else{
                    r = mid -1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        a31_search obj = new a31_search();
        System.out.println(obj.search(new int[]{4,5,6,7,0,1,2}, 0));
    }
}
