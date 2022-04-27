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
        var sortedNums = nums.clone();

        sortedNums.sort() //O(n·log(n))
        var left = 0
        var right = sortedNums.size - 1

        while (left < right) { // Binary Search. O(log(n))
            val sum = sortedNums[left] + sortedNums[right]
            if (sum == target) {
                res = intArrayOf(left, right);
                break
            } else if (sum < target)
                left++
              else
                right--
        }

        //Find indices in original array. O(n)
        var resIndices = IntArray(2);
        for (i in nums.indices){
            if(nums[i]==sortedNums[res[0]]) {
                resIndices[0] = i
                break;
            }
        }

        for (i in nums.indices) {
            if (i != resIndices[0] && nums[i] == sortedNums[res[1]]){
                resIndices[1] = i
                break;
            }
        }

        return resIndices;
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