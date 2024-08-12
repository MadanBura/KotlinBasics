package ConditionalStatement

/// while, if else,when, for loop, break

fun main() {
    val shoppingCart = mutableListOf<String>()
    var totalAmount = 0

    while (true) {
        println("\n--- Shopping Cart Menu ---")
        println("1. Add Item")
        println("2. View Cart")
        println("3. Checkout")
        println("4. Exit")
        print("Choose an option: ")

        when (readLine()?.toIntOrNull()) {
            1 -> {
                println("Available items:")
                println("1. Iphone 15 - $475")
                println("2. Samsung - $300")
                println("3. Pixel - $325")
                print("Select an item to add: ")

                val selectedItem = readLine()?.toIntOrNull()

                when (selectedItem) {
                    1 -> {
                        shoppingCart.add("IPHONE 15")
                        totalAmount += 2
                        println("Added IPHONE 15 to the cart.")
                    }
                    2 -> {
                        shoppingCart.add("Samsung S23")
                        totalAmount += 1
                        println("Added Samsung S23 to the cart.")
                    }
                    3 -> {
                        shoppingCart.add("Pixel")
                        totalAmount += 3
                        println("Added Pixel to the cart.")
                    }
                    else -> println("Invalid item selection.")
                }
            }
            2 -> {
                if (shoppingCart.isEmpty()) {
                    println("Your cart is empty.")
                } else {
                    println("Items in your cart:")
                    for (item in shoppingCart) {
                        println(item)
                    }
                    println("Total amount: $$totalAmount")
                }
            }
            3 -> {
                if (shoppingCart.isEmpty()) {
                    println("Your cart is empty. Please add items before checking out.")
                } else {
                    println("Proceeding to checkout...")
                    println("Items in your cart:")
                    for (item in shoppingCart) {
                        println(item)
                    }
                    println("Total amount: $$totalAmount")

                    println("Do you want to confirm the purchase? (yes/no)")
                    val confirm = readLine()
                    if (confirm.equals("yes", ignoreCase = true)) {
                        println("Thank you for your purchase!")
                        break
                    } else {
                        println("Checkout canceled.")
                    }
                }
            }
            4 -> {
                println("Exiting the program.")
                break
            }
            else -> println("Invalid option. Please try again.")
        }
    }
}
