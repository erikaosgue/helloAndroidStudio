package com.erikaosgue.helloandroidstudio.ObjectOrientedProgramming

// Enum color class
// It is type Safety declaring the available values
// (in this case the colors), this avoid
// failing or performance issues,
// because they are int representation internally
// but we can still access the value Color as a string
enum class Color(val rgb: Int) {

    // Declaration of the available values
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF0);

    fun containsRed(): Boolean {
        return this.rgb and 0xFF0000 != 0
    }
}

fun main(args: Array<String>) {
    /* Decimal numbers from 0-9: */
    // 12540 = (1*10 ^4)+(2*10^3)+(5*10^2)+(4*10^1)+(0*10^0)

    /* Hexadecimal from 0-9-A-F */
    // 10x12540 = (1*16 ^4)+(2*16^3)+(5*16^2)+(4*16^1)+(0*16^0) = 750072
    println(0x10) //16
    println(0x1F) //31
    println(0xFF) //255

    //Colors in HEX red,green,blue
    println(0x000000) //black
    println(0xFF0000) //red
    println(0x00FF00) //green
    println(0x0000FF) //blue


    /* BINARY NUMBERS 0-1 */
    // 010101 = (0*2^5) + (1*2^4) + (0*2^3) + (1*2^2) + (0*2^1)+(1*2^0) =21
    println("Binary number 0b010101: ${0b010101}")

    println(Color.RED)
    println(Color.RED.containsRed())
    println(Color.GREEN.containsRed())
    println(Color.BLUE.containsRed())
    println(Color.YELLOW.containsRed())
}
