package leetCodeProblem

import kotlin.test.Test
import kotlin.test.assertEquals

internal class BestTimeToBuyAndSellStockTest {
    private val testMaxProfit = BestTimeToBuyAndSellStock();
    @Test
    fun case1() {
        val prices = intArrayOf(7,1,5,3,6,4)
        val max = 5;
        checkMax(prices,max);
    }

    @Test
    fun case2() {
        val prices = intArrayOf(7,6,4,3,1)
        val max = 0;
        checkMax(prices,max);
    }

    @Test
    fun case3() {
        val prices = intArrayOf(7,4,5,6,4,2,1,5)
        val max = 4;
        checkMax(prices,max);
    }

    @Test
    fun case4() {
        val prices = intArrayOf(9,8,7,6,5,4,3,2)
        val max = 0;
        checkMax(prices,max);
    }

    private fun checkMax(prices:IntArray, maxExpected:Int){
        var max = testMaxProfit.maxProfitBruteForce(prices);
        assertEquals(maxExpected,max);
        max = testMaxProfit.maxProfitBruteForceOptimized(prices);
        assertEquals(maxExpected,max);
        max = testMaxProfit.maxProfitBruteForceTimeOptimized(prices);
        assertEquals(maxExpected,max);
    }
}