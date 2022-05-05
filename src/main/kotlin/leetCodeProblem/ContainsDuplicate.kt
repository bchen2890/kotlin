package leetCodeProblem

/**
 * @param nums an array of integers
 * @return true if any value appears at least twice in the array, and false if every element is distinct
 */
class ContainsDuplicate {
    /**
     * Brute Force Solution. Complexity O(n^2)
     */
    fun solutionBruteForce (nums:IntArray):Boolean{
        for(i in nums.indices){
            for (j in i until nums.size){
                if (i!=j && nums[i]==nums[j])
                    return true;
            }
        }
        return false;
    }
    /**
     * SortBefore Solution. Complexity O(n·log(n))
     */
    fun solutionSortBefore (nums:IntArray):Boolean{
        nums.sort();
        for(i in 1 until nums.size){
            if (nums[i-1]==nums[i])
                return true;
        }
        return false;
    }
}