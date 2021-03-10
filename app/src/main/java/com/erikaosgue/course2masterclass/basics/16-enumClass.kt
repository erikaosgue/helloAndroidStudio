package com.erikaosgue.course2masterclass.standardFunctions

import com.erikaosgue.helloandroidstudio.ObjectOrientedProgramming.Color


fun main() {

    val color = Color.RED
    println(color)

    when(color) {
        Color.RED -> println("You chose red")
        Color.BLUE -> println("You chose blue")
        Color.GREEN -> println("You chose green")
    }
    println(Colors.RED.timeUsed)
    println(Colors.BLUE.name)
    println(Colors.GREEn.ordinal)

    /*** ============= Game Exercise ==================***/
    var currentState = GameState.STARTED
    for(i in 1..30) {
        println("${currentState.ordinal + 1}, $currentState")
        currentState = changeState(currentState)
    }

}

fun changeState(currentState: GameState): GameState {

    when(currentState) {
        GameState.STARTED -> return GameState.PLAYING
        GameState.PLAYING -> return GameState.GAMEOVER
        GameState.GAMEOVER -> return GameState.STARTED
    }

}
enum class Colors(val timeUsed: Int) {
    RED(timeUsed = 34),
    BLUE(timeUsed = 22),
    GREEn(timeUsed = 12)
}

enum class GameState {
    STARTED,
    PLAYING,
    GAMEOVER

}
