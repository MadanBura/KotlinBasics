package ArrayProblems

import kotlin.math.max
import kotlin.math.min

//. Find maximum profit earned by buying and selling shares (we are allowed to buy and sell only once).	//LeetCode 121. Best Time to Buy and Sell Stock
//	input- {1, 5, 2, 3, 7, 6, 4, 5}
//	output- 6 (buy stock when price = 1 and sell it when price = 7)
//   /count maximum profit in array having stocks prices at different hour

fun main(){

    var arr : IntArray = intArrayOf(1, 5, 2, 3, 7, 6, 4, 5)

    var minPrice = arr[0]
    var maxProfit = 0

    for(i in arr){

        if(i < minPrice){
            minPrice = i
        }

        val profit = i - minPrice
        if(profit > maxProfit){
            maxProfit = profit
        }
    }
    println("Maximum profit is : $maxProfit")
}


