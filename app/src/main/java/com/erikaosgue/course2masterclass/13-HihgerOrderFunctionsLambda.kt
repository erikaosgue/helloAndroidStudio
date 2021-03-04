package com.erikaosgue.course2masterclass

fun main(args: Array<String>) {

    /**** Option 1 Declaring parameters before******/
   /* val names: ArrayList<String> = arrayListOf("Alica", "Dani", "Erika")
    val myLambdaFun = {name: String -> println("Hello there $name")}
    sayHello(names, myLambdaFun)
    */

    /**** Option 2 declaring the lambda function in the call******/
    /*val names: ArrayList<String> = arrayListOf("Alica", "Dani", "Erika")
    sayHello(names) {name: String -> println("Hello there $name")}
    */

    /**** Option 3 Declaring both parameters wothin the call of the function******/
    sayHello(arrayListOf("Alica", "Dani", "Erika"))
        {name: String -> println("Hello there $name")}
}

fun sayHello(names: ArrayList<String>, myLambdaFun: (String) -> Unit) {
    for (name in names)
        myLambdaFun(name)
}