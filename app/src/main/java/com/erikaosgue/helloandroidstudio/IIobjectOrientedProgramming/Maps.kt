package com.erikaosgue.helloandroidstudio.IIobjectOrientedProgramming

fun main(args: Array<String>) {

    /********** Immutable Maps *************/

    // Creating a immutable Map using PAIR
    val namesToAges = mapOf(Pair("Josh", 21), Pair("Mery", 33))

    // Creating a immutable Map using TO
    val namesToAges2 = mapOf("Josh" to 21, "Merry" to 33 )

    println(namesToAges)

    /*********** Map Functions ************/

    // Check for equality btw two maps
    println(namesToAges == namesToAges2)

    // Access basic data of the Map
    println(namesToAges.keys)    // [Josh, Mery]
    println(namesToAges.values)  // [21, 33]
    println(namesToAges.entries) // [Josh=21, Mery=33]


    /********** Mutable Maps *************/

    // Creating a Mutable Map (add and remove values)
    val countryToInhabitants = mutableMapOf(
            "Germany" to 80_000_000,
            "USA" to 300_000_000)


    // Adding a New pair to the map
    countryToInhabitants.put("Australia", 23_000_000) // or
    countryToInhabitants["Australia"] = 23_000_000


    // putIfAbsent only adds the value if doesn't exist
    countryToInhabitants.putIfAbsent("USA", 320_000_000)


    // Print the MAP
    println(countryToInhabitants) //{Germany=80000000, USA=300000000, Australia=23000000}


    // Check for an value, key in the Map
    println(countryToInhabitants.contains("Australia"))
    println(countryToInhabitants.containsKey("Australia"))
    println(countryToInhabitants.containsValue(20_000_000))

    // GET the value by the KET
    println(countryToInhabitants.get("Germany"))
    println(countryToInhabitants["Germany"])
    println(countryToInhabitants.getOrDefault("France", 0))


    // Loop through all the Entries in a MAP
    namesToAges.entries.forEach {
        // it.key = name
        // it.value = age
        println("${it.key} is ${it.value} years old")
    }
}