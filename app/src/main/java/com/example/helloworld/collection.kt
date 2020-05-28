package com.example.helloworld

fun main(){
    //map -> (key,value)로 짝지어져있음. 어떤 value를 찾기위한 key
    var map1 = mapOf(Pair("name","hojun")) // 맵 선언은 pair로. 얜 수정이 안됩니다.
    var map2 = mutableMapOf<String, String>() // 얜 선언만 할 수 있고(타입만 정하고) 얜 수정이 됩니다. - mutable
    map2.put("Nickname", "Jun") // 여기서 값만 넣는다.
    map2.put("age", "27")


    //keys
    println(map2.keys) // array형태로 key들만 나온다.

    for(i in map2){
        println(i)
        i.key // key만 뺄수도있고
        i.value // value만 뺄수도 있다.
    }

}