package com.erikaosgue.helloandroidstudio


fun main(args: Array<String>){


    /* ================================ STRING ============================== */

    println("\n============== STRING ===================\n")

    var myString = "Hello World!"
    println(myString)



    /* ================================ ARRAYS ============================== */
    println("\n============== ARRAYS ===================\n")

    // arrayOf Can't be change the length
    val states1 = arrayOf("Texas", "Illinois", "Iowa", "California")
    states1.forEach(::println)


    // Also could be assign any data type in the array
    val mixed = arrayOf("Erika", 1, 2.3, false)
    mixed[2] = 3.1426 // No error

    // intArrayOf  only should contain list of integers
    val listOfNumbers = intArrayOf() //Just numbers
    println("listOfNumbers: $listOfNumbers")

    // doubleArrayOf should only contain list of Doubles
    val listOfDoubles = doubleArrayOf() //Juts Doubles
    println("listOfDoubles: $listOfDoubles")


    //=======  CONCATENATION of arrays =========== //

    val states2 = arrayOf("Idaho", "florida")
    val allStates = states1 + states2
    println("\n[Concatenation]=> [states1 + states2]=> allStates: $allStates")


    // ====== PRINT AN ARRAY =====================//

    // Double colon is a reference to a function or to class
    // What really means?
    println("\n*** Using forEach to print the array:\n")
    println("[allStates.forEach(::println)]\n")
    allStates.forEach(::println)
    println("Print the size of each element in the array:\n${allStates.map(String::length)}")


    /* === PROPERTIES AND FUNCTIONS OF ARRAY == */

    println("\n**** PROPERTIES AND FUNCTIONS OF ARRAY *****\n")


    //Get the size of the array
    val size = allStates.size
    println("allStates.size: $size")

    //Check if the array is empty
    val empty: Boolean = allStates.isEmpty()
    println("allStates.isEmpty(): $empty")

    // check if a value is in the array
    val result = allStates.contains("Kentucky")
    println("allStates.contains('Kentuky'): $result")




    /* ======================================= LISTS =============================== */


    println("\n============== LIST ===================\n")

    val  listMix = listOf("Udemy", 10, 3.5) // Mix of datatype
    val arrayList = arrayListOf("Erika", "Michael", "Sarah")
    val mutableList  = mutableListOf<String>("Erika", "Michael", "Sarah")

    println("list: $listMix") //list: [Udemy, 10, 3.5]
    println("arrayList: $arrayList") // arrayList: [Erika, Michael, Sarah]
    println("mutableList: $mutableList") //mutableList: [Erika, Michael, Sarah]


    // *** CHANGE VALUE OF A LIST *** //

    println("\n ***** CHANGE VALUE OF A LIST *****\n")

    println("listMix[0] = \"Marte\" //error\n")

    println("arrayList[0] = \"Marte\") //No Error\n")
    arrayList[1] = "Marte"

    println("mutableList[0] = \"Marte\") //No Error")
    mutableList[0] = "Marte"


    // ===== FUNCTIONS FOR LIST =======//

    println("\n====Functions for LIST =====\n")

    println("listMix size: ${listMix.size}")
    println("arrayList size: ${arrayList.size}")
    println("mutableList size: ${mutableList.size}")


    println("\n**** Add and Remove Functions *****\n")

    println("listMix.add() //error")
    println("listMix.remove() //error\n")

    println("arrayList.add(\"Hello\") //No Error")
    arrayList.add("Hello")

    println("arrayList.remove(\"Erika\") //No Error\n")
    arrayList.remove("Erika")

    println("mutableList.add(\"Hello\") //No Error")
    mutableList.add("Hello")

    println("arrayList.remove(\"Erika\") //No Error\n")
    mutableList.remove("Erika")

    println("\n**** SUBLIST *****\n")


    println("list: $listMix")
    println("arrayList: $arrayList")
    println("mutableList: $mutableList\n")

    println("listMix.subList(0, 2): ${listMix.subList(0, 2)}")
    println("arrayList.subList(0, 2): ${arrayList.subList(0, 2)}")
    println("mutableList.subList(0, 2): ${mutableList.subList(0, 2)}")












}