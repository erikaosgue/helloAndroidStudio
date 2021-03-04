package com.erikaosgue.course2masterclass

/**
 * Exercise: Sealed classes
A lottery returns prizes. It can either return a car, a vacation or a gift card.
A function lottery returns prizes every time it is called. It will randomly return one of the three types of prizes.
Print out a specific message for each type of prize won.

 *
 */
import kotlin.random.Random

fun main() {

    for (i in 1..10) {
        val prize = lotterry()
        when (prize) {
            is Vacation -> println("i am going to holiday")
            is Car -> println("Wow I won a car")
            is GiftCard -> println("I won a Gitcard")
        }
    }
}

fun lotterry(): Prize {

    val number = Random.nextInt(3)
    return when(number) {
        0 ->  VW()
        1 ->  FranceHoliday()
        else ->  Dollar10()
    }
}
sealed class Prize

sealed class Car2: Prize()
sealed class Vacation: Prize()
sealed class GiftCard: Prize()

class VW: Car2()
class FranceHoliday: Vacation()
class Dollar10: GiftCard()
