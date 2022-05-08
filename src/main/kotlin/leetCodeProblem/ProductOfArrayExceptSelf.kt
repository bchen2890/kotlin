package leetCodeProblem

/**
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 * @param nums an array of integers.
 * @return an array answer such that answer[i] is equal to the product
 *          of all the elements of nums except nums[i].
 */
class ProductOfArrayExceptSelf {
    fun solution(nums: IntArray): IntArray {
        val n = nums.size
        val prefix = IntArray(n)
        val suffix = IntArray(n)
        var answer = IntArray(n);
        var left = 1;
        var right = 1;

        for(i in 0 until n) {
            prefix[i] = left
            left *= nums[i]
        }
        for (i in (n-1) downTo 0) {
            suffix[i] = right
            right *= nums[i]
        }
        for( i in 0 until n){
            answer[i] = prefix[i] * suffix[i]
        }

        return answer;
    }
}