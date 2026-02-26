package com.w3wide.kotlin.playground

fun main() {
    println("--- Functions in Kotlin ---")

    // 1. Basic Function
    greet("Kotlin Learner")

    // 2. Function with Return Type
    val sum = add(10, 20)
    println("Sum is $sum")

    // 3. Single-Expression Function
    println("Product is ${multiply(5, 4)}")

    // 4. Default & Named Arguments
    printInfo(name = "Hasrat") // Using default age
    printInfo(name = "Ali", age = 25) // Providing both

    println("--- Practice Exercises ---")

    /**
     * EXERCISE 1: Simple Function
     * Task: Create a function 'square' that takes an Int and returns its square.
     * Use the single-expression syntax (fun square(n: Int) = ...).
     */

    println("square of 5 is: ${square(5)}")

    /**
     * EXERCISE 2: Default Arguments
     * Task: Create a function 'displayGreeting' that takes 'message' (String) 
     * and 'name' (String, default value "User"). 
     * It should print "$message, $name!"
     */

    displayGreeting("Hello! Kotlin Lang")
    displayGreeting("Hello! Kotlin Lang", "Hasrat")

    /**
     * EXERCISE 3: Named Arguments
     * Task: Create a function 'formatDate' with parameters 'day', 'month', and 'year'.
     * Call it using named arguments in a different order than defined.
     */

    formatDate(
        day = "Sunday",
        month = "January",
        year = "2001"
    )

    formatDate(
        month = "Junuary",
        year = "2001",
        day = "Sunday"
    )

    formatDate(
        year = "2001",
        day = "Sunday",
        month = "January"
    )
}

fun formatDate(day: String, month: String, year: String) {
    println("Day is $day, and month is $month, and year is $year")
}

fun square(n: Int): Int = n * n

fun displayGreeting(message: String, name: String = "User") {
    println("$message, $name!")
}

// --- Examples ---

fun greet(name: String) {
    println("Hello, $name!")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

// Single-expression function
fun multiply(a: Int, b: Int) = a * b

fun printInfo(name: String, age: Int = 0) {
    println("Name: $name, Age: $age")
}
