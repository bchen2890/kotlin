package leetCodeProblem

/**
 * @param nums an array of integers.
 * @return the largest sum of contiguous subarrays (containing at least one number)
 */
class MaximumSubarray {
    /* Brute Force Solution. O(n^2). Not accepted because of Time Limit Exceeded. */
    fun solutionBruteForce(nums: IntArray): Int {
        var max = Int.MIN_VALUE
        var sum:Int
        for (i in nums.indices){
            sum = 0
            for (j in i until nums.size){
                sum += nums[j]
                max = max.coerceAtLeast(sum)
            }
        }
        return max
    }
}