package com.erikaosgue.course2masterclass.standardFunctions

/*
* Read client names from the console until the word stop is introduced.
*  If the string is empty, the client is null.
* Print out a hello message for each client.
*/


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