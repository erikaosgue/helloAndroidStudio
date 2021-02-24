package com.erikaosgue.helloandroidstudio.IIobjectOrientedProgramming

/*
 * <E> Angles Brackets for Parameters of type E
 * Generic classes
 * E => Can be any element type (Generic Type):
 * class, int, double, wherever type!
 */

class Stack<E>(vararg val items: E) {

    // items will be an Array

    val elements = items.toMutableList()

    fun push(element: E) {
        println("Adding element: $element")
        elements.add(element)
    }

    fun pop(): E? {
        if (isEmpty()) {
            println("The stack is already empty")
            return null
        }
        println("Removing element: ${elements[elements.size-1]}")
        return elements.removeAt(elements.size - 1)
    }

    fun isEmpty(): Boolean {
        return elements.isEmpty()
    }

    fun print() {
        println(elements)
    }
}


/*
 * Creating a Generic Function
 * T -> will be type strings in the example stack2
 * vararg elements will be an Array<T> -> Array<String>
 * Return will be the call of the class Stack<T> -> Stack<String>("Hi", "Hey", "Hello")
*/

fun <T>stackOf(vararg elements: T): Stack<T> {
    print("Elements in stackOf generic function will enter as an ")

    // Checking the data type of the
    println("${elements::class.simpleName}") //Array
    // println("${elements::class.qualifiedName}") //kotlin.Array

    // Printing the elements in the Array
    //elements.forEach(::println)
    // Return the instance of the generic class Stack
    // use the start * to send the Array as vararg

    return Stack(*elements)
}

fun main() {

    println("\n****** stack1 ********")

    val stack = Stack(3,5, 3, 8)
    stack.print()
    println("Pop: ${stack.pop()}")
    println("Pop: ${stack.pop()}")
    println("Pop: ${stack.pop()}")
    println("Pop: ${stack.pop()}")
    println("Pop: ${stack.pop()}")

    val e = 3
    println("Push: $e")
    stack.push(e)
    stack.print()

    println("\n ****** stack2 ********")
    val stack2 = stackOf("Hi", "Hey", "Hello")
    stack2.print()

    println("\n ****** stack3 ********")
    val stack3 = stackOf("Hi")
    stack3.print()
}