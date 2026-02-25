package com.w3wide.kotlin.playground


fun main() {
    val name = "kotlin Playground"
    val age = 1

    println("This is $name and I am $age years old.")

    println("\n--- Practice Exercises ---")

    /**
     * EXERCISE 1: Variables (val vs var)
     * Task: Declare a mutable variable 'score' and initialize it to 0.
     * Then, update its value to 10 and print it.
     */
    var score = 0

    score = 10
    println(score)

    /**
     * EXERCISE 2: Data Types
     * Task: Declare the following variables with explicit types:
     * - A Double named 'price' with value 19.99
     * - A Boolean named 'isAvailable' with value true
     * - A Long named 'distance' with value 150000000L
     */

    val price = 19.99
    val isAvailable = true
    val distance = 150000000L

    /**
     * EXERCISE 3: String Templates
     * Task: Use the variables from Exercise 2 to print a message:
     * "The item costs $19.99 and availability is true."
     */

    println("The item cost $$price and availability is $isAvailable.")

    /**
     * EXERCISE 4: Type Conversion
     * Task: Convert the 'price' Double to an Int and print the result.
     * Hint: Use .toInt()
     */

    val result = price.toInt()
    println(result)

    /**
     * EXERCISE 5: Nullable Types (Bonus)
     * Task: Declare a nullable String variable 'nickname' and set it to null.
     * Then print its length safely using the safe call operator (?.)
     */

    val nickname: String? = null

    println(nickname?.length ?: 0)
}
