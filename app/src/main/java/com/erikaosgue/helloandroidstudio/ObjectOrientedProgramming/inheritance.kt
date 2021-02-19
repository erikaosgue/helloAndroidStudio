package com.erikaosgue.helloandroidstudio.ObjectOrientedProgramming


/* Lesson 38. Open classes and Inheritance */

// Open allow the inheritance.
open class Person1(open val name: String, open var age: Int) {

    init {
        println("\n=== Object Created! ===\n")
    }

    fun speak() {
        println("Hello I am ${this.name} and You?")
    }

    fun greet() {
        println("Good Morning")
    }

    fun getYearOfBirth() =  2021 - age
}

// override allows to override what comes from the inheritance.
// The new properties of Student will override what the Person class has defined
// for a class Student to be able to override a property, is necessary to have [open] properties from the class
// that is inheriting from. In this case from class Person1

class Student(override val name: String, override var age: Int): Person1(name, age) {

    fun isIntelligent() = true
}

class Employee(override val name: String, override var age: Int): Person1(name, age) {

    fun getPayment() {
        println("the employee got the payment!")
    }
}


fun main(args: Array<String>) {

    var student = Student("Andrea", 23)
    student.speak()
    println("Is the employee intelligent: ${student.isIntelligent()}")

    var employee = Employee("Rosalba", 50)
    employee.greet()
    employee.getPayment()

}



