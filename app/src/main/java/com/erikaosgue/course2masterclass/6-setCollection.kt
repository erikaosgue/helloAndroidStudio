package com.erikaosgue.course2masterclass


fun main() {


    /*************** setOf IMMUTABLE***************/


    // Declare an empty Set, must include the type
    val emptyImmutableSet = setOf<String>()
    println("Declare an empty Set $emptyImmutableSet")

    // Declaring a set with values of Int type
    val immutableNumbers = setOf(3, 4, null, 83, null)
    println(immutableNumbers)

    /* properties we can use with set */
    println("immutableNumbers.size = ${immutableNumbers.size}")
    println("immutableNumbers.contains(3) = ${immutableNumbers.contains(3)}")

    val newNumbers1 = setOf(1, 2, 3)
    println("immutableNumbers.contains(newNumbers1) = ${immutableNumbers.containsAll(newNumbers1)}")

    println("newNumbers Set is empty? = ${newNumbers1.isEmpty()}")

    /*************** hashSetOf MUTABLE***********/

    /** Declare an empty Set **/
    val emptyMutableSet = hashSetOf<String>()
    println("Declare an empty Set $emptyMutableSet")

    // Add element to en empty Set
    emptyMutableSet.add("Erika")

    /** Declare and assign elements to a set **/
    val mutableNumbers = hashSetOf(3, 4,null, 83, null)
    println("Declare and assign numbers to a Set: $mutableNumbers")

    // Add elements to the set
    mutableNumbers.add(44)

    val newNumbers2 = setOf(1, 2, 3)
    mutableNumbers.addAll(newNumbers2)
    println(mutableNumbers)

    // Remove one element
    mutableNumbers.remove(83)
    println("Remove the element 83 to the Set $mutableNumbers")

    // Remove all
    val toRemove = setOf(3, 4)
    mutableNumbers.removeAll(toRemove)
    println("Remove all elements of the Set $mutableNumbers")

    /** other functions
     * hashSetVar.retainAll(Collection)
     * hashSetVar.clear()
     *
     */


}
