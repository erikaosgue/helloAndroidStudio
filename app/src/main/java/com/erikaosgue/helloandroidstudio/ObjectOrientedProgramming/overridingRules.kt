package com.erikaosgue.helloandroidstudio.ObjectOrientedProgramming

abstract class Course(val topic: String, val price: Double) {

    open fun learn() {
        println("Learning a $topic course")
    }
}

interface Learnable {

    fun learn() {
        println("Learning...")
    }
}


open class KotlinCourse(): Course("Kotlin", 999.99), Learnable{

    final override fun learn() {

        // Specify what method to use when having ambiguity
        super<Course>.learn()
        super<Learnable>.learn()
        println("I'm one of the first people to learn Kotlin")
    }

}

//The <final> keyword help the method to not be change in one child class
//for example the follow exercise will show an error, so we can't do this

// Like this SpecialKotlinClass
class SpecialKotlinClass(): KotlinCourse() {
//    override fun learn() {
//       println("Learning special Kotlin Course")
//    }
}



fun main(args: Array<String>) {
    val course = KotlinCourse()
    course.learn()

    val childCourse = SpecialKotlinClass()
    childCourse.learn()
}