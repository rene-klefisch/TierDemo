package com.example.tierdemo

import android.util.Log

 open class Tier(alter: Int, speed: Int, name: String) : AbstractTier(alter, speed, name) {

    override fun alter(neuesAlter: Int) {
        alter = neuesAlter
        Log.i("Test", "Neues Alter: $alter")
    }

    override fun gibInfo(): String {
       val text = "Info: $name ist $alter Jahre alt und ist $speed km schnell."
        Log.i("Test", text)
        return text
    }
}