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
}