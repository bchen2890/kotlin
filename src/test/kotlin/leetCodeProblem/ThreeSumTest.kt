package leetCodeProblem


import kotlin.test.Test
import kotlin.test.assertEquals
internal class ThreeSumTest {
    private val threeSum = ThreeSum();

    @Test
    fun case1(){
        val nums = intArrayOf(-1,0,1,2,-1,-4)
        checkSumAllSolution(nums)
    }

    @Test
    fun case2(){
        val nums = intArrayOf()
        checkSumAllSolution(nums)
    }

    @Test
    fun case3(){
        val nums = intArrayOf(0)
        checkSumAllSolution(nums)
    }

    private fun checkSumAllSolution(nums:IntArray){
        val res = threeSum.solutionBruteForce(nums)
        checkSum(res)
    }
    private fun checkSum(res: List<List<Int>>){
        for (l in res){
            assertEquals(l[0]+l[1]+l[2],0)
        }
    }
}