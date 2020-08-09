package com.example.tierdemo

import android.util.Log

class TierHund(alter: Int, speed: Int, name: String) : Tier(alter, speed, name) {

    fun gibLaut(){
        Log.i("Test", "$name sagt WAU WAU")
        alter(alter + 1)
    }
}