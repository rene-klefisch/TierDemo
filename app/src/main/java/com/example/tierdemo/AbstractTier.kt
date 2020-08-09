package com.example.tierdemo

abstract class AbstractTier(alter: Int, speed: Int, name: String){
    var alter = alter
    var speed = speed
    var name = name

    abstract fun alter(neuesAlter : Int)
    abstract fun gibInfo() : String
}