package com.example.helloworld

fun main(){
    val Hello1: String = "Hello World" // final(상수)
    var Hello2: String = "Hello World" // int, string 등등(변수)

    Hello()
    println(Hello1)
    println(Hello2())
}

fun Hello(){ //fun Hello(): String --> Return값이 있으면 옆에 자료형 적어줌
    println("Hell")
}
fun Hello2() : String{
    return "Heeelllo"
}