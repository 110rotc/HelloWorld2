package com.example.helloworld

fun main(){
    //class -> 어떤 유사 기능들의 집합체  // Data class -> 데이터를 세팅, 받아오기 불러오기 등등
    var cls = Helloclass()
    var cls2 = Helloclass(4)

    var person = Person(1, "hojun")
}

//main 함수 밖에다가
class Helloclass{
    var age : Int = 0
    init { //이 클래스를 호출하면 init부터 실행됨(초기화)

    }
    constructor() // 생성자 -> 어떤 값을 넘기면서
    constructor(age : Int) // 보조생성자
    {this.age = age}
}


data class Person(val age : Int, val name:String)