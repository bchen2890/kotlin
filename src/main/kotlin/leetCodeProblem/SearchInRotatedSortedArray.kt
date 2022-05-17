package leetCodeProblem
/**
 * @param nums a sorted rotated array of unique integers.
 * @param target a integer
 * @return the index of target if it is in nums, or -1 if it is not in nums
 */
class SearchInRotatedSortedArray {
    /* Brute Force Optimized Solution. O(n).*/
    fun solutionBruteForceOptimized(nums: IntArray, target:Int): Int {
        for(i in nums.indices){
            if(nums[i]==target) return i
        }
        return -1
    }
    /* BinarySearch Solution. O(log(n)).*/
    fun solutionBinarySearch(nums: IntArray, target:Int): Int {
        var left = 0
        var right = nums.size-1
        while ( left <= right) {
            val mid = (left+right)/2
            if(target==nums[mid]) return mid
            if(nums[left]<=nums[mid])
                if(target>=nums[left]&&target<=nums[mid])
                    right = mid-1
                else
                    left=mid+1
            else
                if(target>=nums[mid]&&target<=nums[right])
                    left = mid+1
                else
                    right = mid-1
        }
        return -1
    }
}