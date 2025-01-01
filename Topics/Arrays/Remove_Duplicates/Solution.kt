class Solution {
    fun maxProfit(prices: IntArray): Int {
        var profit = 0
        var tempBuy = prices[0]

        for (i in prices) {
            if (i < tempBuy) {
                tempBuy = i
            } else if (i > tempBuy) {
                profit += i - tempBuy
                tempBuy = i
            }
        }

        return profit
    }
}
