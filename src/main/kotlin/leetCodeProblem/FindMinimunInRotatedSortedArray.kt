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
}