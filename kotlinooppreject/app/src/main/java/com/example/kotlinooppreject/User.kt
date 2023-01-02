package com.example.kotlinooppreject

class User : people{
    //Property
    var name : String? = null
    var age : Int? = null

    //Constructor vs init

    constructor(nameInput:String, ageInput : Int){
        this.name = nameInput
        this.age = ageInput
        println("User Created")
    }

    init {
        println("init")
    }
}