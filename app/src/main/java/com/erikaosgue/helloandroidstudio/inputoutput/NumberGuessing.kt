package com.erikaosgue.helloandroidstudio.inputoutput

// ** to compile:
// $ kotlinc NumberGuessing.tk -include-runtime -d NumberGuessing.jar
// ** run the executable:
// $ java -jar NumberGuessing.jar

import java.util.*

fun main() {

   // nextInt will generate a number btw 0-99
   val number = Random().nextInt(100) + 1
   var input: String?
   var guess = -1


   while (guess != number) {
      print("Guess a number between 1 and 100: ")

      // Getting the input from the user
      // input will be a <String>
      input = readLine()

      //Checking if the input is not null
      if (input != null) {

         // can throw NumberException if is not a NUMBER
         guess = input.toInt()

      }


      println(guess)

      if (guess < number) {
         println("Too low")
      }else if (guess > number) {
         println("Too large")
      }else {
         println("You WON!")
      }
   }

}