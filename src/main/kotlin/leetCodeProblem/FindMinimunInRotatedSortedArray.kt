package leetCodeProblem

/**
 * @param nums a sorted rotated array of unique integers.
 * @return the minimum of nums
 */
class FindMinimunInRotatedSortedArray {
    /* Brute Force Optimized Solution. O(n).*/
    fun solutionBruteForceOptimized(nums: IntArray): Int {
        for(i in nums.indices){
            if(nums[i]<nums[0])
                return nums[i]
        }
        return nums[0]
    }

    /* BinarySearch Solution. O(log(n)).*/
    fun solutionBinarySearch(nums: IntArray): Int {
        if(nums.size == 1) return nums[0]
        var left = 0
        var right = nums.size-1
        while ( left < right) {
            val mid = (left+right)/2
            if(nums[mid]<nums[right])
                right = mid
            else
                left = mid+1
        }
        return nums[right]
    }
}