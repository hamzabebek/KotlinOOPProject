package com.example.kotlinooppreject

class SuperMusician(name: String, instrument: String, age: Int) : Musicians(name, instrument, age) {
    fun sing(){
        println("Nothing Else Matters")
    }
}