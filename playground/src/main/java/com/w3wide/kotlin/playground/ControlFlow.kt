package com.w3wide.kotlin.playground

fun main() {
    println("--- Control Flow in Kotlin ---")

    // 1. IF as an Expression
    val a = 10
    val b = 20
    val max = if (a > b) a else b
    println("Max is $max")

    // 2. WHEN Expression (Replacement for switch)
    val day = (1..7).random()
    val dayName = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        else -> "Weekend"
    }
    println("Day $day is $dayName")

    println("--- Control Flow Exercises ---")

    /**
     * EXERCISE 1: IF/ELSE Expression
     * Task: Given a variable 'temperature', print:
     * - "Cold" if temp < 15
     * - "Warm" if temp is between 15 and 25
     * - "Hot" if temp > 25
     */
    val temperature = (15..50).random()
    var result = ""

    if (temperature < 15) {
        result = "Cold"
    } else if (temperature in 15..25) {
        result = "Warm"
    } else {
        result = "Hot"
    }

    println(result)

    /**
     * EXERCISE 2: WHEN Expression
     * Task: Use 'when' to check the value of 'rating' (1 to 5) and print a message:
     * 1 or 2 -> "Poor"
     * 3 -> "Average"
     * 4 or 5 -> "Good"
     * Any other value -> "Invalid Rating"
     */
    val rating = (1..6).random()

    println( "Rating is " +
        when (rating) {
            1, 2 -> "Poor"
            3 -> "Average"
            4, 5 -> "Good"
            else -> "Invalid Rating"
        }
    )

    /**
     * EXERCISE 3: FOR Loop
     * Task: Print the numbers from 1 to 5 using a for loop and a range (1..5).
     */

    for (i in 1..5) println(i)

    /**
     * EXERCISE 4: WHILE Loop
     * Task: Declare a variable 'count' starting at 5. 
     * Use a while loop to print 'count' and decrement it until it reaches 1.
     */

    println("while loop")

    val count = 5

    for (i in count downTo 1) {
        println(i)
    }
}
