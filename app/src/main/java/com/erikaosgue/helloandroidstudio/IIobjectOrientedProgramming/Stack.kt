package com.erikaosgue.helloandroidstudio.IIobjectOrientedProgramming

/*
 * <E> Angles Brackets Parameters for
 * Generic classes
 * E => Can be any element:
 * class, int, double, wherever type!
 */

class Stack<E>(vararg val items: E) {

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

fun main() {
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

}