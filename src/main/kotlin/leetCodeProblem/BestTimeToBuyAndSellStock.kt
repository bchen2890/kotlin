package leetCodeProblem

/**
 * @param prices an array of integers where prices[i] is the price of a given stock on the i_th day.
 * @return an integer so that it's the maximum profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
            If there is not any profit, it returns 0.
 */
class BestTimeToBuyAndSellStock {
    /* Brute Force Solution. O(n^2)
    * */
    fun maxProfitBruteForce (prices:IntArray): Int {
        var max = 0;
        for (p in prices.indices){
            for(j in p until prices.size){
                max = maxOf(max,prices[j]-prices[p])
            }
        }
        return max;
    }

    /* Optimized Brute Force Solution. O(n)
* */
    fun maxProfitBruteForceOptimized (prices:IntArray): Int {
        var max = 0;
        var min = Int.MAX_VALUE;
        for (p in prices){
            min = minOf(min, p)
            max = maxOf(max,p-min)
        }
        return max;
    }
}