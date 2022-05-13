package leetCodeProblem

/**
 * @param nums an array of integers.
 * @return the largest product of contiguous subarrays (containing at least one number)
 */
class MaximumProductSubarray {
    /* Brute Force Solution. O(n^2).*/
    fun solutionBruteForce(nums: IntArray): Int {
        var max = nums[0]
        var prod = 0
        for(i in nums.indices){
            prod = 1
            for (j in i until nums.size){
                prod *= nums[j]
                max = max.coerceAtLeast(prod)
            }
        }
        return max
    }
    /* Brute Force Optimized Solution. O(n).*/
    fun solutionBruteForceOptimized(nums: IntArray): Int {
        var max = nums[0]
        var min = max
        var res = max
        for(i in 1 until nums.size){
            val minTemp = min
            val num = nums[i]
            min = (max * num).coerceAtMost(num.coerceAtMost(min*num))
            max = (minTemp * num).coerceAtLeast(num.coerceAtLeast(max*num))
            res = res.coerceAtLeast(max)
        }
        return res
    }
}