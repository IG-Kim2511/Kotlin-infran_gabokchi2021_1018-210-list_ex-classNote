package com.example.list_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



//        🍀 var ~~~ =  mutableListOf<String>() : ~~~에 string 값을 넣겠다
        var testList = mutableListOf<String>()

//        ~~안에 값 넣음. ~~~.add("a")
        testList.add("a")
        testList.add("b")
        testList.add("c")


//        Log
        Log.d("MainActivity" , testList.toString())


//
        Log.d("MainActivity", testList[0])
        Log.d("MainActivity", testList[1])
        Log.d("MainActivity", testList[2])

    }
}