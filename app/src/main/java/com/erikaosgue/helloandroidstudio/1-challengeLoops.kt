
package com.erikaosgue.helloandroidstudio

/*For this challenge, try to write a program that calculates the sum of all
Numbers from 100 to 100,000 and prints out the result.
You can check your solution by going to my GitHub page linked in this
lecture’s resources.*/

fun main() {

    var sum = 0L
    for (i in 100..100000L) {
        sum += i
    }
    println(sum)

}