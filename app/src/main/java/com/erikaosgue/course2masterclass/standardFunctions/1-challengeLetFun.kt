package com.erikaosgue.course2masterclass.standardFunctions

fun main() {
    val clients = arrayListOf<String?>()

    do {
        println("Enter client name: ")
        val input = readLine()
        input?.let {  // if input is != null will enter
            if (it.toLowerCase() != "stop")
            if (it == "")
                clients.add(null)
            else
                clients.add(it)

        }

    }while(input?.toLowerCase() != "stop")

    println(clients)

    clients.forEach {
        it?.let {
            println("Hello $it")
        }
    }
}