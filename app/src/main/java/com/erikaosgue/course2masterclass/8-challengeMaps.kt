package com.erikaosgue.course2masterclass

/*

You manage an amusement park, and you have a map
that stores dates and attendance.
var attendance = hashMapOf(Pair(“23 Sept”, 2837), Pair(“24 Sept”, 3726), Pair(“25 Sept”, 6253))
Add a value for 26 Sept.
How many people attended in total on 25 and 26 Sept?
Is data for 22 Sept available?

*/

fun main() {

    var attendance = hashMapOf(Pair("23 Sept", 2837), Pair("24 Sept", 3726), Pair("25 Sept", 6253))
    attendance["26 Sept"] = 1122

    /*** It is important to use the elvis Operator Because we may get a Null value ***/
    var attend25 = attendance["25 Sept"]?:0
    var attend26 = attendance["26 Sept"]?:0

    println("Total people attending the 25 and 26 was: ${attend25 + attend26}")

    println("Is data for the 22 Sep available: ${attendance.containsKey("22 Sept")}")


}