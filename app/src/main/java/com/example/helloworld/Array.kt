package com.example.helloworld

fun main(){
    var arr1 = listOf("1", "2") // 수정불가
    var arr2 = mutableListOf("1", "2") //mutableof -> 수정가능

    arr2.add("3")
    println(arr2)

    for((index,i) in arr2.withIndex()){
        println("$index $i")


        }
    //object : 최상위 객체, 아무거나 넣을 수 있음 // 코틀린에서는 Any
    //Casting은 Any 변수에 들어간놈이 누군지 추적하는 과정
    var hello: Any = "hello"

    if(hello is String){ // AutoCasting -> 알아서 맞춘다!
        var str : String = hello
    }
}