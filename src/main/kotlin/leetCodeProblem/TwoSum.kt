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
     * Binary Search Solution. Complexity O(n·log(n))
     */
    fun solutionBinarySearch(nums: IntArray, target: Int): IntArray {
        var res = IntArray(2);
        var indices = IntArray(nums.size);

        for (i in nums.indices)
            indices[i]=i

        indices.sortedWith { i, j -> nums[i] - nums[j] } //O(n·log(n))

        var left = 0
        var right = indices.size - 1
        while (left < right) { //O(log(n))
            val sum = nums[left] + nums[right]
            if (sum == target) {
                res = intArrayOf(left, right);
                break
            } else if (sum < target)
                left++
              else
                right--
        }
        return res;
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