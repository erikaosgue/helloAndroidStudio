package com.erikaosgue.helloandroidstudio.ObjectOrientedProgramming

/* Lesson 39. Abstract Classes */

// abstract also is Open which allows the inheritance,
// but doesn't allow the creating of an object from this abstract class.

abstract class Person2(open val name: String, open var age: Int) {


    abstract fun speak()

    open fun myFun() {
        println("In the Person class Open method")
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

class Student2(override val name: String, override var age: Int): Person2(name, age) {


    override fun speak() {
        println("Hello I am a student")
    }

    fun isIntelligent() = true

    override fun myFun() {
       println("Here in the Student class")
    }
}

class Employee2(override val name: String, override var age: Int): Person2(name, age) {

    override fun speak() {
        println("Hello I am a employee")
    }
    fun isIntelligent() {
        println("Here true is intelligent")
    }

    fun getPayment() {
        println("the employee got the payment!")
    }
}

fun main(args: Array<String>) {

    var student = Student2("Andrea", 23)
    student.speak()
    println("Is the employee intelligent: ${student.isIntelligent()}")
    student.myFun()

    var employee = Employee2("Rosalba", 50)
    employee.speak()
    employee.greet()
    employee.getPayment()
    employee.isIntelligent()


    println("val person = Person2(\"Erika\") //Error: cannot create an Instance of an abstract class")

}