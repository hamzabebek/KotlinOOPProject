package com.example.kotlinooppreject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.processNextEventInCurrentThread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //constructor
        var myUser = User("James", 25)
        myUser.name = "Lars"
        myUser.age = 26

        println(myUser.age)
        println(myUser.name)

        //Encapsulation

        var james = Musicians("James", "Guitar", 55)
        println(james.age)
        println(james.returnBandName("Hamza"))
        println(james.returnBandName("Kirk"))

        // Inheritance

        var lars = SuperMusician("Lars", "Drums", 65)
        println(lars.name)
        println(lars.returnBandName("Hamza"))
        lars.sing()

        //polymorphism

        //static polymorphism
        var mathematic = Mathematic()
        println(mathematic.sum())
        println(mathematic.sum(3, 4))
        println(mathematic.sum(3, 4, 5))
        //dynamic polymorphism
        val animal = Animal()
        animal.sing()
        val barley = Dog()
        barley.test()
        barley.sing()

        //Abstract & interface
        // var myPeople = people()
        println(myUser.information())

        var myPiano = Piano()
        myPiano.brand = "Yamaha"
        myPiano.digital = false
        println(myPiano.roomName)
        myPiano.info()
        //Lambda Expressions
        fun printString(myString : String){
            println(myString)
        }
        printString("My String")

        val testString = {myString : String -> println(myString)}
        testString("My Lambda String")

        val multiplyLambda = {A: Int, B: Int -> A * B}
        println(multiplyLambda(5,4))

        val multiplyLambda2 : (Int,Int) -> Int = {a,b -> a*b}
        println(multiplyLambda2(5,5))

        //asynchronous

        //call back function, listener function, completion function

        fun downloadMusicians(url: String, completion : (Musicians) -> Unit){
            //url -> download
            //data
            val kirkHammet = Musicians("Kirk","Guitar",60)
            completion(kirkHammet)
        }
        downloadMusicians("metallica.com",{Musicians ->
            println(Musicians.name)
        })
    }
}