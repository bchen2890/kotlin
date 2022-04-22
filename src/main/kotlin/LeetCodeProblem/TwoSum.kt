package LeetCodeProblem

class TwoSum {
    fun solution(nums: IntArray, target: Int): IntArray {
        var res = IntArray(2);

        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                if (nums[j] == target - nums[i]) {
                    res = intArrayOf(i, j);
                }
            }
        }
        return res
    }
}