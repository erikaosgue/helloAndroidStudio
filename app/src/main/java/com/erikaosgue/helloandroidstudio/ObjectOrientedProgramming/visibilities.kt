package com.erikaosgue.helloandroidstudio.ObjectOrientedProgramming


//Properties of top-level
private var privateTopLevelProperty: String = "privatePackageProperty"
internal var internalTopLevelProperty: String = "internalPackageProperty"
var publicTopLevelProperty: String = "publicPackageProperty"

//methods:
//private
//internal
//public

// Classes
private class PrivateTopLevelClass(val name: String)
internal class InternalTopLevelClass(val name: String)


open class Parent(val name: String) {

    // Properties
    private val privateParentPropertyOBJ = PrivateTopLevelClass("$name.privateTopLeveClass")
    protected val protectedParentProperty = "$name.protectedString"
    internal val internalParentPropertyOBJ = InternalTopLevelClass("$name.internalTopLevelClass")

    //Methods
    protected fun protectedParentFun() {
        println("${privateParentPropertyOBJ.name}")
    }
}

private class Child(name: String) : Parent(name) {

    fun publicChildFun() {
        // Here using a protected variable from the parent class
        println("$protectedParentProperty")

        // Here using a Protected Method from the Parent class
        protectedParentFun()
    }
    private fun privateChildFun() {
       println("I am a private Function from child Class")
    }


    internal fun internalChildFun() {
        privateChildFun()
    }

}



fun main(args: Array<String>) {

    //Calling the Properties defined in the ToP-level
    println(privateTopLevelProperty)
    println(internalTopLevelProperty)
    println(publicTopLevelProperty)

    // Calling the Open Parent class
    val parent = Parent("Parent")

    /*** privateClass a private variable (only inside the Parent class) ***/
    //println(parent.privateParentProperty)

    /**** protectedParentProperty variable (only inside the Parent and Child class) ***/
    // println(parent.protectedParentProperty)


    // Calling an Internal Property that holds an Internal Object
    /**** internalParentProperty is an Instance internalClass *****/
    println(parent.internalParentPropertyOBJ.name)

    /**** name is an public variable ******/
    println(parent.name)


    /***
     * ============= CHILD =======================
     */

    // Private Child is a top-level definition
    val child = Child("Child")


    /**** Private Child Function Error (Only Inside the Child class)****/
    // child.privateChildFun()

    /**** internalChildFun *****/
    child.internalChildFun()

    /****  Public Child Function ****/
    child.publicChildFun()

    /*** name variable is public *****/
    println(child.name)


    /*** Inheriting from Parent Class *****/

    // Internal class is a property from the open Parent class
    /** private from Parent Error (only inside the class)***/
    //println(child.privateParentPropertyOBJ)

    /** protected from Parent Error (Only inside the Parent and CHild class)***/
    //println(child.protectedParentProperty)

    /** internal from Parent ***/
    println(child.internalParentPropertyOBJ.name)

}


