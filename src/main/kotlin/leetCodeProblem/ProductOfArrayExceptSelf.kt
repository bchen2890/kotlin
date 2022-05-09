package leetCodeProblem

/**
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 * @param nums an array of integers.
 * @return an array answer such that answer[i] is equal to the product
 *          of all the elements of nums except nums[i].
 */
class ProductOfArrayExceptSelf {
    fun solution(nums: IntArray): IntArray {
        val suffix = IntArray(nums.size)
        var answer = IntArray(nums.size);
        var left = 1;
        var right = 1;

        for (i in (nums.size-1) downTo 0) {
            suffix[i] = right
            right *= nums[i]
        }
        for( i in nums.indices){
            answer[i] = left * suffix[i]
            left *= nums[i]
        }

        return answer;
    }
}