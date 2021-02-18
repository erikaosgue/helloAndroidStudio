package com.erikaosgue.helloandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Leccion 1
        // variablesYConstantes()

        //Leccion 2
        // sentenciaWhen()

        //Leccion 3
        // arrays()

        // Leccion 4
        //maps()

        //leccion 5
        //loops()

        //Leccion 6
        //nullSafety()

        //Leccion 7
        whenChallenge()
    }

    private fun variablesYConstantes() {
        // This is a comment
        /*
            This is a multiline comment
         */
        //1. Variables should be camelCase
        var myVariable = "Hello World"
        println(myVariable)

        // Constantes => Unicamente un solo valor, no se le
        //puede asignar otro valor una vez asignado su valor

        val myFirstConstant = "Hello World"

        println(myFirstConstant)

        //myFirstConstant = 'Another Value'

        // This is unnecesary
        val myString: String = myVariable
        val myString2 = "Welcome"
        val myString3 = myString2 +  " "  +  myString

        println(myString3)
    }

    // When statement
    private fun sentenciaWhen() {
        val country = "EEUU"

        when (country) {
            "Colombia", "España", "Mexico", "Peru", "Argentina" -> {
                println("El idioma es Español")
            }
            "EEUU" -> {
                println("El Idioma es el Ingles")
            }
            "Francia" -> {
                println("El idioma es el Francés")
            } else -> {
            println("No se conoce el Idioma")
        }
        }
    }


    private fun arrays() {
        val name = "Brais"
        val surname = "Moure"
        val company = "MoureDev"
        val age = "32"

        //Creation of the array (Sintaxis)
        val myArray  = arrayListOf<String>()

        // Declaration and definition of the array
        //val myArray  = listOf("Hola", "Bienvenidos al tutorial")

        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)
        println(myArray)


        // Añadir mas elementos al Array
        myArray.addAll(listOf("Hola", "Bienvenidos al tutorial"))
        println(myArray)


        //Acceso A datos
        val myCompany = myArray[2]
        // val myCompany :String = myArray[2]
        println(myCompany)


        //Sustitucion reemplazo de elementos
        myArray[5] = "Guten morgen"
        println(myArray)

        //Eliminacion de Datos
        myArray.removeAt(4)
        println(myArray)

        //Recorrer un Array
        myArray.forEach {
            println(it)
        }

        //otras Operaciones
        println(myArray.count())

        println(myArray.first())

        println(myArray.last())

        println(myArray.sort())

        myArray.clear()
    }

    //Maps And Dictionaries
    private fun maps() {

        //Sintaxis
        var myMap: Map<String, Int> = mapOf()
        println(myMap)

        //Añadir Elementos to the dictionary
        // Este es un dictionart not mutable
        myMap = mapOf("Erika" to 1, "Daniela" to 2, "Scott" to 3)
        println(myMap)

        // So we can't do this
        // myMap["Sebas"] = 4

        //Instead Create a Mutable Map
        val myMap2 = mutableMapOf("Sofi" to 1, "Dani" to 3)
        myMap2["Sebas"] = 4

        println(myMap2)

    }

    private fun loops() {

        val myArray = listOf("Hola", "Bienvenidos al tutorial")
        val myMap2 = mutableMapOf("Sofi" to 1, "Dani" to 3)

        for (i in myArray) {
            println(myArray)
        }

        for (item in myMap2) {
            println("${item.key}-${item.value}")
        }

        for (x in 0..10) {
            println(x)
            // output => 0 1 2 3 ... 10
        }
        for (x in 0 until 10) {
            println(x)
            //output => 0 1 2 3 ... 9
        }
        for (x in 0 ..10 step 2) {
            println(x)
            //output => 0 2 4 6 8 10
        }
        for (x in 10 downTo 0){
            println(x)
            //output => 10 9 8 7 ... 0
        }

        var x = 0
        while (x < 10) {
            println(x)
            x++
        }
    }

    // Understanding Null pointer exception
    // Defining a null variable
    private fun nullSafety() {

        var myString = "Erika Osorio"
//        myNullString = null Daria un error de compilacion
        println(myString)


        var myNullString: String? = "Erika Osorio"
        println(myNullString)
        myNullString = null
        println(myNullString)


    }

    private fun whenChallenge() {

        val random = Random().nextInt(50) + 1

        when(random) {
            in 1..10 -> println("Range 1 to 10 Random Value = $random")
            in 11..20 ->  println("Range 11 to 20 Random Value = $random")
            in 21..30 ->  println("Range 21 to 30 Random Value = $random")
            in 31..40 ->  println("Range 31 to 40 Random Value = $random")
            else ->  println("Random value more than 40 $random")
        }
    }


}
