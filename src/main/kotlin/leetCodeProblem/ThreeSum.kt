package leetCodeProblem

/**
 * @param nums an array of integers
 * @param target a integer
 * @return {i,j,k} so that nums[i]+nums[j]+nums[k]==0 and i!=j and i!=k and j!=k.
 */
class ThreeSum {
    /**
     * Brute Force Solution. Complexity O(n^3). Not accepted because of Time Limit Exceeded.
     */

    fun solutionBruteForce(nums: IntArray): List<List<Int>> {
        var res = mutableListOf<List<Int>>()

        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                for (k in j+1 until nums.size) {
                    if (nums[j]+nums[k] + nums[i] == 0 ) {
                        val sortedArray = mutableListOf(nums[i],nums[j],nums[k])
                        sortedArray.sort()
                        res.add(sortedArray)
                    }
                }
            }
        }
        return res.distinct()
    }
}