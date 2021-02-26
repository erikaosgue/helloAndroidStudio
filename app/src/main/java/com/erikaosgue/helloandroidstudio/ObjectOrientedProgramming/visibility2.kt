package com.erikaosgue.helloandroidstudio.ObjectOrientedProgramming
import com.erikaosgue.helloandroidstudio.ObjectOrientedProgramming.*

fun main(args: Array<String>) {

    var holdingInternalObject = InternalTopLevelClass("From Module")
    println(holdingInternalObject.name)

    /**** Open Class Public ****/
    val publicParentClass = Parent("Parent From Module")
    println(publicParentClass.internalParentPropertyOBJ.name)

    /*** Private Class Error***/
    //val privateClass = Child("Child")

}
