package com.example.tierdemo

import android.util.Log

class TierKatze(alter: Int, speed: Int, name: String) : Tier(alter, speed, name) {

    fun gibLaut(){
        Log.i("Test", "$name sagt MIAU")
        alter(alter + 2)
    }
}