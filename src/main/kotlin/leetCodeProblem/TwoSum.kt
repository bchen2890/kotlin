package leetCodeProblem

/**
 * @param nums an array of integers
 * @param target a integer
 * @return {i,j} so that nums[i]+nums[j]==target and i!=j.
 */
class TwoSum {
    /**
     * Brute-force Solution. Complexity O(n^2)
     */
    fun solutionBruteForce(nums: IntArray, target: Int): IntArray {
        var res = IntArray(2);

        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                if (nums[j] == target - nums[i]) {
                    res = intArrayOf(i, j);
                    break;
                }
            }
        }
        return res
    }

    /**
     * HashSet Solution. Complexity O(n)
     */
    fun solutionHashSet(nums: IntArray, target: Int): IntArray {
        var res = IntArray(2);
        var numsSet = HashSet<Int>();

        for (i in nums.indices) {
            val diff = target-nums[i];
            if (numsSet.contains(diff)) {
                res = intArrayOf(i, nums.indexOf(diff));
                break;
            }
            numsSet.add(nums[i])
        }
        return res
    }

    /**
     * HashMap Solution. Complexity O(n)
     */
    fun solutionHashMap(nums: IntArray, target: Int): IntArray {
        var res = IntArray(2);
        var numsMap = HashMap<Int, Int>();

        for (i in nums.indices) {
            val diff = target-nums[i];
            if (numsMap.contains(diff)) {
                res = intArrayOf(i, numsMap[diff]!!);
                break;
            }
            numsMap[nums[i]] = i
        }
        return res
    }
}