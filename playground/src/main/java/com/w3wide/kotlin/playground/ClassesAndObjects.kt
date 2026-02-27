package com.w3wide.kotlin.playground

fun main() {
    println("--- Classes & Objects in Kotlin ---")

    // 1. Basic Class & Object
    val car = Car()
    car.drive()

    // 2. Primary Constructor
    val person = Person("Alice", 30)
    person.introduce()

    // 3. Properties with Custom Getters
    val rect = Rectangle(10, 5)
    println("Rectangle area: ${rect.area}")

    println("--- Practice Exercises ---")

    /**
     * EXERCISE 1: Simple Class
     * Task: Create a class 'Dog' with a function 'bark' that prints "Woof!".
     * Instantiate it and call bark() in main.
     */
    val dog = Dog()
    dog.bark()

    /**
     * EXERCISE 2: Constructor Parameters
     * Task: Create a class 'Book' with a primary constructor taking 'title' (String)
     * and 'author' (String). Add a function 'displayInfo' that prints "Book: $title by $author".
     */
    val book = Book("To Kill a Mockingbird", "Harper Lee")
    book.displayInfo()


    /**
     * EXERCISE 3: Custom Properties
     * Task: Create a class 'Circle' that takes 'radius' (Double) in the constructor.
     * Add a read-only property 'circumference' with a custom getter (formula: 2 * Math.PI * radius).
     */
    val circle = Circle(2.234)
    println("The circumference of Circle is ${circle.circumference}")
}

// --- Examples ---

class Circle(val radius: Double) {
    val circumference: Double
        get() = 2 * Math.PI * radius

}

class Book(val title: String, val author: String) {
    fun displayInfo() {
        println("Book: $title by $author")
    }
}

class Dog {
    fun bark() {
        println("Woof!")
    }
}

class Car {
    fun drive() {
        println("Driving the car...")
    }
}

class Person(val name: String, val age: Int) {
    fun introduce() {
        println("Hi, I'm $name and I am $age years old.")
    }
}

class Rectangle(val width: Int, val height: Int) {
    val area: Int
        get() = width * height
}
