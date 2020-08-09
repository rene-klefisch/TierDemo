package com.example.tierdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val waldi = TierHund(5, 25, "Waldi")
        waldi.gibLaut()
        waldi.gibLaut()
        val mimi = TierKatze(5, 20, "Mimi")
        mimi.gibLaut()
        mimi.gibLaut()
    }
}