package com.erikaosgue.helloandroidstudio.inputoutput

import java.io.File

fun main() {

    // The file path have to be from the root of the project or absolute path

    // Absolute Path (WORKS)
    // var inputFilePath: String = "/home/erikaosgue/erika_work/AndroidStudioProjects/HelloAndroidStudio/app/src/main/java/com/erikaosgue/helloandroidstudio/inputoutput/inputfile.txt"

    // Content Root (Works adding app)
     val inputFilePath :String = "app" + "/src/main/java/com/erikaosgue/helloandroidstudio/inputoutput/inputfile.txt"

    // source root (error)
    // val inputFilePath :String =  "com/erikaosgue/helloandroidstudio/inputoutput/inputfile.txt"

    // Repository root (error)
    // val inputFilePath: String = "inputoutput/inputfile.txt"



    // Testing a file2
    // Repository root (works)
    //inputFilePath = "app/src/inputfile2.txt"


    var lineNumber = 0
    File(inputFilePath).forEachLine {
        ++lineNumber

        // [it] is a variable => content of the line
        println("#$lineNumber: $it")
    }
}