package com.erikaosgue.helloandroidstudio.IIobjectOrientedProgramming

import java.io.File

fun main(args: Array<String>) {

    val filePath :String = "app/src/inputfile58.txt"
    val mapsOfIPs = mutableMapOf<String, Int>()

    File(filePath).forEachLine {

        /*
        // ONE way to do it
        if (mapsOfIPs.containsKey(it)) {
            mapsOfIPs[it] = mapsOfIPs[it]!!.plus(1)
        }else {
            mapsOfIPs[it] = 1
        }
        */


        // SECOND and Simpler way
        val counter = mapsOfIPs.getOrDefault(it, 0)
        mapsOfIPs.put(it, counter + 1)

    }


    val mostFrequentIP = mapsOfIPs.maxByOrNull { it.value }
    println("The mos frequent IP is ${mostFrequentIP?.key}\nFound with a total of ${mostFrequentIP?.value} times\n")

    val (IPAddress, counter) = mapsOfIPs.entries.maxByOrNull { it.value }!!
    println("The mos frequent IP is $IPAddress\nFound with a total of $counter times")


}