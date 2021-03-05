package com.erikaosgue.course2masterclass

/**
 * Type Parameters
 * Restricting the Data Type that the parameters
 * should have
 *
 * ----- Exercise 1 ------
 * A class can take a generic type of Collection of strings.
 * It has a function generates through the elements, converts them
 * to String and prints them out to the console.
 *
 * ----- Exercise 2 ------
 * Type constraints
 * Create an abstract class Shape that defines a method getArea
 * which takes an argument size.
 * Create two subclasses, Square and Circle, that inherit from
 * Shape, and implement the method.Square area = size * size
 * Circle area = size * size * 3.1415
 * Create another class Geometry that takes a generic argument
 * of type Shape, and has a method that prints a message which
 * includes the area of the shape that is passed.
 * Instantiate the Geometry class and print the area of the shape.

 *
 */
fun main() {

    val chef = Chef<Fruit>()
    chef.cook(Apple())

    //------- Exercise 1 ----------
    println(" ==== Exercise 1 Collection Printer === =")
    println(" -----using a Set -----")
    val printer1 = Printer<Set<String>>()
    printer1.iterate(hashSetOf("Erika", "Andrea", "luis"))

    println(" ---- using a list------")
    val printer2 = Printer<List<String>>()
    printer2.iterate(listOf("Erika", "Andrea", "luis"))

    // ------ Exercise 2 ----------
    println(" ==== Exercise 2 Geometry === =")

    val geometry1 = Geometry<Shape>()
    geometry1.printShape(Circle(), 4)
}

abstract class Fruit {
    abstract fun peel()
}
class Apple: Fruit() {
    override fun peel(){
        println("Peeling the Apple")
    }
}

class Chef<T: Fruit> {
    fun cook(item: T) {
        item.peel()
    }
}
// -----Exercise 1 ------
class Printer<T: Collection<String>> {
    fun iterate(collection: T) {
        collection.forEach { println(it.toString())}
    }
}

// ---- Exercise 2 -----
abstract class Shape {
    abstract fun getArea(size: Int): Double
}

class Square: Shape() {
    override fun getArea(size: Int) = size * size.toDouble()

}
class Circle: Shape() {
    override fun getArea(size: Int) = size * size * 3.1415
}

class Geometry<T: Shape> {
    fun printShape(shape: T, size: Int) {
        println("The area of the Shape ${shape::class.simpleName} is ${shape.getArea(size)}")
    }
}